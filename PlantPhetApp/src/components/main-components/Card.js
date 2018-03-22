import React, { Component } from 'react';
import { View, Text } from 'react-native';

//class
class Card extends Component<{}> {
  //Constructor
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <View>
      <Text>Card</Text>
    </View>);
  }
}

export { Card };
