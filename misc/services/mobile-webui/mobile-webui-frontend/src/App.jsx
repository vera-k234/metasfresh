import React from 'react';
import './App.css';
import { connect } from 'react-redux';
import Header from './components/Header';
import Launchers from './components/containers/Launchers';

import BarcodeScanner from './components/containers/BarcodeScanner';
import ConfirmActivity from './components/containers/ConfirmActivity';

function App() {
  const barcodeMockProps = {
    activityId: '1',
    caption: 'Scan picking slot',
    componentType: 'common/scanBarcode',
    readonly: true,
    componentProps: {
      barcodeCaption: null,
    },
  };

  const confirmActivityProps = {
    activityId: '3',
    caption: 'Complete picking',
    componentType: 'common/confirmButton',
    readonly: true,
    componentProps: {
      question: 'Are you sure?',
    },
    wfProcessId: '200',
  };

  return (
    <>
      <Header appName="webUI app" />
      <Launchers />
      <BarcodeScanner {...barcodeMockProps} />
      <ConfirmActivity {...confirmActivityProps} />
    </>
  );
}

const mapStateToProps = (state) => {
  return state;
};

export default connect(mapStateToProps, null)(App);
