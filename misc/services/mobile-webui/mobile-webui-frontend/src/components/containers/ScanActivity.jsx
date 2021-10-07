import React, { Component } from 'react';
import PropTypes from 'prop-types';
import toast, { Toaster } from 'react-hot-toast';
import { postScannedBarcode } from '../../api/scanner';
import CodeScanner from './CodeScanner';
import { stopScanning } from '../../actions/ScanActions';
import { updatePickingSlotCode } from '../../actions/PickingActions';
import { setActivityEnableFlag } from '../../actions/WorkflowActions';
import { connect } from 'react-redux';

class ScanActivity extends Component {
  scanActivityPostDetection = ({ detectedCode, activityId }) => {
    const { wfProcessId, token, stopScanning, updatePickingSlotCode, activities, setActivityEnableFlag } = this.props;
    postScannedBarcode({ detectedCode, wfProcessId, activityId, token })
      .then(() => {
        // update the scanned activity code in the store
        updatePickingSlotCode({ detectedCode, wfProcessId, activityId });
        // display a toast
        toast('Successful scanning!', { type: 'success', style: { color: 'white' } });
        // update the next activity
        const nextActivityId = Number(activityId) + 1;
        nextActivityId in activities &&
          setActivityEnableFlag({ wfProcessId, activityId: nextActivityId, isActivityEnabled: true });
      })
      .catch(() => {
        toast('Scanned code is invalid!', { type: 'error', style: { color: 'white' } });
      });
    stopScanning();
  };

  render() {
    const { uniqueId, activityItem, dataStored } = this.props;
    const { scannedCode, isComplete, isActivityEnabled } = dataStored;

    let caption = scannedCode ? `Code: ${activityItem.componentProps.barcodeCaption}` : activityItem.caption;

    return (
      <div className="mt-0">
        <CodeScanner
          key={uniqueId}
          id={uniqueId}
          isActivityEnabled={isActivityEnabled}
          isComplete={isComplete}
          caption={caption}
          activityId={activityItem.activityId}
          scanButtonStatus={scannedCode ? 'complete' : 'incomplete'}
          onDetection={this.scanActivityPostDetection}
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
    );
  }
}

const mapStateToProps = (state, ownProps) => {
  const {
    wfProcessId,
    activityItem: { activityId },
  } = ownProps;
  return {
    dataStored: state.wfProcesses_status[wfProcessId].activities[activityId].dataStored,
    activities: state.wfProcesses_status[wfProcessId].activities, // we need this to enable the next activity post scanning
    token: state.appHandler.token,
  };
};

ScanActivity.propTypes = {
  caption: PropTypes.string,
  componentProps: PropTypes.object,
  stopScanning: PropTypes.func.isRequired,
  updatePickingSlotCode: PropTypes.func.isRequired,
  wfProcessId: PropTypes.string.isRequired,
  token: PropTypes.string.isRequired,
  uniqueId: PropTypes.string.isRequired,
  activityItem: PropTypes.object.isRequired,
  dataStored: PropTypes.object.isRequired,
  setActivityEnableFlag: PropTypes.func.isRequired,
  activities: PropTypes.object,
};

export default connect(mapStateToProps, { stopScanning, updatePickingSlotCode, setActivityEnableFlag })(ScanActivity);
