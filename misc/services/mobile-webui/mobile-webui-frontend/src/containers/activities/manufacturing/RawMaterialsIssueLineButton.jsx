import React, { Component } from 'react';
import PropTypes from 'prop-types';
import counterpart from 'counterpart';
import { push } from 'connected-react-router';

import LineButton from '../common/LineButton';
import ButtonWithIndicator from '../../../components/ButtonWithIndicator';
import ButtonQuantityProp from '../../../components/ButtonQuantityProp';
import { pushHeaderEntry } from '../../../actions/HeaderActions';

class RawMaterialsIssueLineButton extends Component {
  handleClick = () => {
    const { wfProcessId, activityId, lineId, dispatch, caption } = this.props;

    const location = `/workflow/${wfProcessId}/activityId/${activityId}/lineId/${lineId}`;
    dispatch(push(location));

    dispatch(
      pushHeaderEntry({
        location,
        values: [
          {
            caption: counterpart.translate('activities.mfg.ProductName'),
            value: caption,
            bold: true,
          },
        ],
      })
    );
  };

  render() {
    const { caption, uom, qtyIssued, qtyToIssue, completeStatus, appId, lineId, isUserEditable } = this.props;

    return (
      <button
        key={lineId}
        className="button is-outlined complete-btn"
        disabled={!isUserEditable}
        onClick={this.handleClick}
      >
        <ButtonWithIndicator caption={caption} completeStatus={completeStatus}>
          <ButtonQuantityProp
            qtyCurrent={qtyIssued}
            qtyTarget={qtyToIssue}
            uom={uom}
            appId={appId}
            subtypeId="issues"
          />
        </ButtonWithIndicator>
      </button>
    );
  }
}

RawMaterialsIssueLineButton.propTypes = {
  //
  // Props
  wfProcessId: PropTypes.string.isRequired,
  activityId: PropTypes.string.isRequired,
  lineId: PropTypes.string.isRequired,
  caption: PropTypes.string.isRequired,
  isUserEditable: PropTypes.bool.isRequired,
  completeStatus: PropTypes.string.isRequired,
  uom: PropTypes.string.isRequired,
  qtyIssued: PropTypes.number.isRequired,
  qtyToIssue: PropTypes.number.isRequired,
  appId: PropTypes.string.isRequired,
  //
  // Actions
  dispatch: PropTypes.func.isRequired,
};

export default LineButton(RawMaterialsIssueLineButton);
