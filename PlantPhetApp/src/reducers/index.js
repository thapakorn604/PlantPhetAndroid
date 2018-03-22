/* @flow */
import { combineReducers } from 'redux';
import AppReducers from './AppReducers';

const rootReducer = combineReducers({
  app: AppReducers
});

export default rootReducer;
