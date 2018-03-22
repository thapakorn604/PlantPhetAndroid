/** @flow*/
import React, { Component } from 'react';
// import { Platform } from 'react-native';
// import { createStore, applyMiddleware } from 'redux';
// import { createLogger } from 'redux-logger';
import { Provider } from 'react-redux';
import Router from './system/Router';
import configureStore from './system/StoreConfig';

export const store = configureStore();

class App extends Component<{}> {
  render() {
    return (
      <Provider store={store}>
        <Router />
      </Provider>
    );
  }
}

export default App;
