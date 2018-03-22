/* @flow */
import { createStore, applyMiddleware } from 'redux';
import { createLogger } from 'redux-logger';
import reducers from '../reducers';
import thunk from 'redux-thunk';

export default () => {
  const middleware = [thunk];
  if (__DEV__) {
    middleware.push(createLogger());
  }

  const store = createStore(
    reducers,
    undefined,
    applyMiddleware(...middleware)
  );

  console.log('store', store.getState());
  return store;
};
