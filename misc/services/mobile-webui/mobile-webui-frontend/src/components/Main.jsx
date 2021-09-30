import React from 'react';
import PropTypes from 'prop-types';

import Header from './Header';

function Main({ children }) {
  return (
    <>
      <Header appName="webUI app" />
      {children}
    </>
  );
}

Main.propTypes = {
  children: PropTypes.node.isRequired,
};

export default Main;
