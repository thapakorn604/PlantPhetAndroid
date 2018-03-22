/* @flow */
import React from 'react';
import { connect } from 'react-redux';
import { Router, Scene, Actions } from 'react-native-router-flux';
import HelloWorld from '../containers/HelloWorldContainer'
import Card from '../containers/CardContainer'

//Handler onBackPress in Android device
const onBackPress = () => {
  console.log('Current Scene', Actions.currentScene);
  return true;
};

const RouterWithRedux = connect()(Router);
const RouterComponent = () => {
  return (
    <RouterWithRedux backAndroidHandler={onBackPress}>
      <Scene key="root">
        <Scene
          initial={false}
          navigationBarStyle={{ backgroundColor: '#000000' }}
          tintColor="white"
          key="HelloWorld"
          component={HelloWorld}
          title="Thank You"
          titleStyle={{ alignSelf: 'center' }}
          hideNavBar
        />
        <Scene
          initial={false}
          navigationBarStyle={{ backgroundColor: '#000000' }}
          tintColor="white"
          key="Card"
          component={Card}
          title="Card"
          titleStyle={{ alignSelf: 'center' }}
          hideNavBar
        />
      </Scene>
    </RouterWithRedux>
  );
};

export default RouterComponent;
