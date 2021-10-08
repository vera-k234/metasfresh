import {
  START_WORKFLOW_PROCESS,
  CONTINUE_WORKFLOW_PROCESS,
  ADD_WORKFLOW_STATUS,
  SET_ACTIVITY_ENABLE_FLAG,
} from '../constants/ActionTypes';
import { startWorkflowRequest, continueWorkflowRequest } from '../api/launchers';

/**
 * @method startWorkflow
 * @summary
 */
export function startWorkflow({ wfProviderId, wfParameters }) {
  return (dispatch) => {
    return startWorkflowRequest({ wfProviderId, wfParameters })
      .then(({ data }) => {
        const { endpointResponse } = data;

        dispatch({
          type: START_WORKFLOW_PROCESS,
          payload: { ...endpointResponse },
        });

        dispatch({
          type: ADD_WORKFLOW_STATUS,
          payload: { ...endpointResponse },
        });

        return Promise.resolve(data);
      })
      .catch((err) => {
        Promise.reject(err);
      });
  };
}

/**
 * @method continueWorkflow
 * @summary
 */
export function continueWorkflow(wfProviderId) {
  return (dispatch) => {
    return continueWorkflowRequest(wfProviderId)
      .then(({ data }) => {
        const { endpointResponse } = data;

        dispatch({
          type: CONTINUE_WORKFLOW_PROCESS,
          payload: { ...endpointResponse },
        });

        dispatch({
          type: ADD_WORKFLOW_STATUS,
          payload: { ...endpointResponse },
        });

        return Promise.resolve(data);
      })
      .catch((err) => {
        Promise.reject(err);
      });
  };
}

/**
 * @method setActivityEnableFlag
 * @summary update the isActivityEnabled activity flag
 */
export function setActivityEnableFlag({ wfProcessId, activityId, isActivityEnabled }) {
  return {
    type: SET_ACTIVITY_ENABLE_FLAG,
    payload: { wfProcessId, activityId, isActivityEnabled },
  };
}
