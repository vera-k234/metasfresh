import * as types from '../constants/LaunchersActionTypes';

export const initialState = {};

export default function launchers(state = initialState, action) {
  const { payload } = action;
  switch (action.type) {
    case types.POPULATE_LAUNCHERS:
      return { ...payload.launchers };

    default:
      return state;
  }
}
