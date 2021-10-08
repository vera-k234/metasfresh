import React, { Component } from 'react';
import { connect } from 'react-redux';
import PropTypes from 'prop-types';
import { withRouter } from 'react-router';
import toast, { Toaster } from 'react-hot-toast';
import CodeScanner from './CodeScanner';
import { stopScanning } from '../../actions/ScanActions';
import { updatePickingStepDetectedCode, updatePickingStepQty } from '../../actions/PickingActions';

class PickScreen extends Component {
  onDetection = (scannedData) => {
    const {
      stepProps: { qtyToPick },
      updatePickingStepQty,
    } = this.props;

    const { detectedCode } = scannedData;
    const isValidCode = this.checkIfValidCode(detectedCode);
    const { stopScanning, updatePickingStepDetectedCode, wfProcessId, activityId, lineIndex, stepId } = this.props;
    if (isValidCode) {
      updatePickingStepDetectedCode({ wfProcessId, activityId, lineIndex, stepId, detectedCode });
      updatePickingStepQty({ wfProcessId, activityId, lineIndex, stepId, qty: qtyToPick });
      stopScanning();
    } else {
      toast('Scanned code is invalid!', { type: 'error', style: { color: 'white' } });
      updatePickingStepDetectedCode({ wfProcessId, activityId, lineIndex, stepId, detectedCode: undefined });
      updatePickingStepQty({ wfProcessId, activityId, lineIndex, stepId, qty: 0 });
    }
  };

  checkIfValidCode = (detectedCode) => {
    const {
      stepProps: { huBarcode },
    } = this.props;
    return huBarcode === detectedCode;
  };

  onChangeHandler = (e) => {
    const { updatePickingStepQty, wfProcessId, activityId, lineIndex, stepId } = this.props;
    const inputQty = parseInt(e.target.value);
    if (isNaN(inputQty)) {
      updatePickingStepQty({ wfProcessId, activityId, lineIndex, stepId, qty: '' });
      return;
    }

    const isValidQty = this.validateQtyInput(inputQty);
    if (isValidQty) {
      updatePickingStepQty({ wfProcessId, activityId, lineIndex, stepId, qty: e.target.value });
    } else {
      // show error
      toast('Quantity picked is invalid!', { type: 'error', style: { color: 'white' } });
    }
  };

  validateQtyInput = (numberInput) => {
    const {
      stepProps: { qtyToPick },
    } = this.props;
    return numberInput >= 0 && numberInput <= qtyToPick;
  };

  componentWillUnmount() {
    const {
      stepProps: { qtyPicked },
      wfProcessId,
      activityId,
      lineIndex,
      stepId,
      updatePickingStepQty,
    } = this.props;
    qtyPicked === '' && updatePickingStepQty({ wfProcessId, activityId, lineIndex, stepId, qty: 0 });
  }

  render() {
    const {
      stepProps: { huBarcode, qtyToPick, qtyPicked, detectedCode },
      activityId,
    } = this.props;

    const isValidCode = this.checkIfValidCode(detectedCode);
    const scanBtnCaption = isValidCode ? `Code: ${detectedCode}` : ``;
    const scanButtonStatus = isValidCode ? `complete` : `incomplete`;

    return (
      <div className="pt-3 section picking-step-container">
        <div className="picking-step-details centered-text is-size-5">
          {/* <div className="columns is-mobile">
            <div className="column is-half has-text-right has-text-weight-bold pt-0 pb-0 pl-0 pr-0">Product:</div>
            <div className="column is-half has-text-left pt-0 pb-0">{productName}</div>
          </div>
          <div className="columns is-mobile">
            <div className="column is-half has-text-right has-text-weight-bold pb-0 pl-0 pr-0">Locator:</div>
            <div className="column is-half has-text-left pb-0">{locatorName}</div>
          </div>
          <div className="columns is-mobile">
            <div className="column is-half has-text-right has-text-weight-bold pb-0 pl-0 pr-0">UOM:</div>
            <div className="column is-half has-text-left pb-0">{uom}</div>
          </div> */}
          <div className="columns is-mobile">
            <div className="column is-half has-text-right has-text-weight-bold pb-0 pl-0 pr-0">Barcode:</div>
            <div className="column is-half has-text-left pb-0">{huBarcode}</div>
          </div>
          <div className="columns is-mobile">
            <div className="column is-half has-text-right has-text-weight-bold pb-0 pl-0 pr-0">Quantity to pick:</div>
            <div className="column is-half has-text-left pb-0">{qtyToPick}</div>
          </div>
          <div className="columns is-mobile">
            <div className="column is-half has-text-right has-text-weight-bold pb-0 pl-0 pr-0">Quantity picked:</div>
            <div className="column is-half has-text-left pb-0">
              {detectedCode && <input type="number" value={qtyPicked} onChange={(e) => this.onChangeHandler(e)} />}
              {!detectedCode && qtyPicked}
            </div>
          </div>
          <CodeScanner
            id={huBarcode}
            caption={scanBtnCaption}
            onDetection={this.onDetection}
            activityId={activityId}
            scanButtonStatus={scanButtonStatus}
          />
          <Toaster
            position="bottom-center"
            toastOptions={{
              success: {
                style: {
                  background: 'green',
                },
              },
              error: {
                style: {
                  background: 'red',
                },
              },
            }}
          />
        </div>
      </div>
    );
  }
}

const mapStateToProps = (state, ownProps) => {
  const { workflowId: wfProcessId, activityId, lineId, stepId } = ownProps.match.params;

  return {
    stepProps: state.wfProcesses_status[wfProcessId].activities[activityId].dataStored.lines[lineId].steps[stepId],
    activityId,
    wfProcessId,
    stepId,
    lineIndex: Number(lineId),
  };
};

PickScreen.propTypes = {
  activityId: PropTypes.string.isRequired,
  wfProcessId: PropTypes.string.isRequired,
  lineIndex: PropTypes.number.isRequired,
  stepProps: PropTypes.object.isRequired,
  stopScanning: PropTypes.func.isRequired,
  updatePickingStepDetectedCode: PropTypes.func.isRequired,
  updatePickingStepQty: PropTypes.func.isRequired,
  stepId: PropTypes.string.isRequired,
};

export default withRouter(
  connect(mapStateToProps, { stopScanning, updatePickingStepDetectedCode, updatePickingStepQty })(PickScreen)
);
