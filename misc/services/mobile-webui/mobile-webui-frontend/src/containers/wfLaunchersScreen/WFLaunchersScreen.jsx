import React, { Component } from 'react';
import { connect } from 'react-redux';
import { v4 as uuidv4 } from 'uuid';
import PropTypes from 'prop-types';

import { populateLaunchers } from '../../actions/LauncherActions';
import { getLaunchers } from '../../api/launchers';
import WFLauncherButton from './WFLauncherButton';
import OfflineNotifBar from '../../components/OfflineNotifBar';

import * as ws from '../../utils/websocket';
import { getServerVersion } from '../../api/update';

class WFLaunchersScreen extends Component {
  componentDidMount() {
    const { populateLaunchers } = this.props;

    // A way to check how getServerVersion() works
    // FIXME delete me
    getServerVersion().then((version) => console.log('Server version: ', version));

    getLaunchers().then((launchers) => {
      populateLaunchers(launchers);
    });
  }

  componentDidUpdate() {
    if (!this.wsClient) {
      const { userToken } = this.props;
      this.wsClient = ws.connectAndSubscribe({
        topic: `/v2/userWorkflows/launchers/${userToken}`,
        onWebsocketMessage: this.onWebsocketMessage,
      });
    }
  }

  componentWillUnmount() {
    ws.disconnectClient(this.wsClient);
    this.wsClient = null;
  }

  onWebsocketMessage = (message) => {
    const { populateLaunchers } = this.props;
    const { launchers } = JSON.parse(message.body);
    populateLaunchers(launchers);
  };

  render() {
    const { launchers: launchersMap, network } = this.props;
    const launchers = Object.values(launchersMap);

    return (
      <div className="container launchers-container">
        {network &&
          launchers.length > 0 &&
          launchers.map((launcher) => {
            let key = launcher.startedWFProcessId ? 'started-' + launcher.startedWFProcessId : 'new-' + uuidv4();
            return <WFLauncherButton key={key} id={key} {...launcher} />;
          })}
        {!network && (
          <OfflineNotifBar headerKey="launchers.offlineMsgHeader" captionKey="launchers.offlineMsgContent" />
        )}
      </div>
    );
  }
}

WFLaunchersScreen.propTypes = {
  //
  // Props
  launchers: PropTypes.object.isRequired,
  userToken: PropTypes.string.isRequired,
  network: PropTypes.bool.isRequired,
  //
  // Actions
  populateLaunchers: PropTypes.func.isRequired,
};

const mapStateToProps = (state) => {
  return {
    launchers: state.launchers,
    userToken: state.appHandler.token,
    network: state.appHandler.network,
  };
};

export default connect(mapStateToProps, { populateLaunchers })(WFLaunchersScreen);
