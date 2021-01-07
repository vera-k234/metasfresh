import React, { FunctionComponent, ReactElement } from 'react';
import View from './View';

const About: FunctionComponent = (): ReactElement => {
  return (
    <View>
      <div className="container">
        <h1 className="title">Page 1</h1>
        <p className="subtitle">Some content</p>
      </div>
    </View>
  );
};

export default About;
