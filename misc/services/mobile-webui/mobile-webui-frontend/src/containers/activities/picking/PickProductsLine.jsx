import React, { Component } from 'react';
import PropTypes from 'prop-types';
import { connect } from 'react-redux';
import { push } from 'connected-react-router';
import { pushHeaderEntry } from '../../../actions/HeaderActions';

import ButtonWithIndicator from '../../../components/ButtonWithIndicator';

class PickProductsLine extends Component {
  handleClick = () => {
    const { wfProcessId, activityId, lineId, caption } = this.props;
    const { push, pushHeaderEntry } = this.props;

    const location = `/workflow/${wfProcessId}/activityId/${activityId}/lineId/${lineId}`;
    push(location);
    pushHeaderEntry({
      location,
      values: [
        {
          caption: 'caption',
          value: caption,
        },
      ],
    });
  };

  render() {
    const { lineId, caption, isLinesListVisible, isActivityEnabled } = this.props;
    return (
      <div className="buttons">
        {isLinesListVisible && (
          <button
            key={lineId}
            className="button is-outlined complete-btn"
            disabled={!isActivityEnabled}
            onClick={() => this.handleClick()}
          >
            <ButtonWithIndicator caption={caption} indicatorType="incomplete" />
          </button>
        )}
      </div>
    );
  }
}

const mapStateToProps = () => {
  return {
    isLinesListVisible: true,
  };
};

PickProductsLine.propTypes = {
  //
  // Props
  wfProcessId: PropTypes.string.isRequired,
  activityId: PropTypes.string.isRequired,
  lineId: PropTypes.string.isRequired,
  caption: PropTypes.string.isRequired,
  isLinesListVisible: PropTypes.bool,
  steps: PropTypes.array.isRequired,
  isActivityEnabled: PropTypes.bool,
  //
  // Actions
  push: PropTypes.func.isRequired,
  pushHeaderEntry: PropTypes.func.isRequired,
};

export default connect(mapStateToProps, { push, pushHeaderEntry })(PickProductsLine);
