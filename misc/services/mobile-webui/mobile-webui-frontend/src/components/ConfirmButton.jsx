import React, { Component } from 'react';
import PropTypes from 'prop-types';

class ConfirmButton extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isPromptDialogOpen: false,
    };
  }

  showConfirmDialog = () => this.setState((prevState) => ({ isPromptDialogOpen: !prevState.isPromptDialogOpen }));

  cancelConfirmDialog = () => this.setState({ isPromptDialogOpen: false });

  /**
   * Execute any function passed as onConfirm prop
   */
  onDialogYes = () => {
    const { onConfirmExec, wfProcessId, activityId: wfActivityId } = this.props;
    onConfirmExec({ token: window.config.API_TOKEN, wfProcessId, wfActivityId });
    // TODO !!! : deal with the response
  };

  render() {
    const { caption, componentProps } = this.props;
    const { isPromptDialogOpen } = this.state;
    const btnCaption = caption || 'Confirm';
    const promptQuestion = componentProps.promptQuestion || 'Are you sure?';

    return (
      <div>
        {/*  Full sconfirm creen dialog  */}
        {isPromptDialogOpen && (
          <div className="prompt-dialog-screen">
            <article className="message confirm-box is-dark">
              <div className="message-header">
                <p>{btnCaption}</p>
                <button className="delete" aria-label="delete" onClick={this.cancelConfirmDialog}></button>
              </div>
              <div className="message-body">
                <strong>{promptQuestion}</strong>
                <div>&nbsp;</div>
                <div className="buttons is-centered">
                  <button className="button is-success confirm-button" onClick={this.onDialogYes}>
                    Yes
                  </button>
                  <button className="button is-danger confirm-button" onClick={this.cancelConfirmDialog}>
                    No
                  </button>
                </div>
              </div>
            </article>
          </div>
        )}
        {/*  Confirm Initiator  */}
        <div>
          <button className="button is-outlined complete-btn" onClick={this.showConfirmDialog}>
            {btnCaption}
          </button>
        </div>
      </div>
    );
  }
  1;
}

ConfirmButton.propTypes = {
  caption: PropTypes.string,
  componentProps: PropTypes.object,
  onConfirmExec: PropTypes.func,
  wfProcessId: PropTypes.string.isRequired,
  activityId: PropTypes.string.isRequired,
};

export default ConfirmButton;
