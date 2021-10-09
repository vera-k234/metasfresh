import React, { Component } from 'react';
import PropTypes from 'prop-types';

import PickProductsLine from './PickProductsLine';

class PickProductsActivity extends Component {
  render() {
    const {
      componentProps: { lines },
      activityState,
      wfProcessId,
      activityId,
    } = this.props;
    const dataStored = activityState ? activityState.dataStored : {};
    const { isActivityEnabled } = dataStored;

    return (
      <div className="pick-products-activity-container mt-5">
        {/* Lines listing */}
        {activityState && lines.length > 0
          ? lines.map((lineItem, lineIndex) => {
              const lineId = '' + lineIndex;
              return (
                <PickProductsLine
                  key={lineId}
                  wfProcessId={wfProcessId}
                  activityId={activityId}
                  lineId={lineId}
                  isActivityEnabled={isActivityEnabled}
                  {...lineItem}
                />
              );
            })
          : null}
      </div>
    );
  }
}

PickProductsActivity.propTypes = {
  caption: PropTypes.string,
  componentProps: PropTypes.object,
  activityState: PropTypes.object,
  wfProcessId: PropTypes.string,
  activityId: PropTypes.string,
};

export default PickProductsActivity;
