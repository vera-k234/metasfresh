import axios from 'axios';

import { getLaunchers } from './launchers';
import { userConfirmation } from './confirmation';

function loginRequest(username, password) {
  return axios.post(`${window.config.SERVER_URL}/auth`, {
    username,
    password,
  });
}

export { getLaunchers, userConfirmation, loginRequest };
