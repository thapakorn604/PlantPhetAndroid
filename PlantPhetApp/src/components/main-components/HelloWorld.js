import React, { Component } from 'react';
import { View, TouchableOpacity, Text, StyleSheet } from 'react-native';
import { Actions } from 'react-native-router-flux'

//class
class HelloWorld extends Component<{}> {
  //Constructor
  constructor(props) {
    super(props);
  }

  componentWillMount() {
    this.props.sayHi();
  }

  _onPressButton() {
    Actions.push('Card');
  }

  render() {
    return (
    <View>
      <TouchableOpacity style={styles.buttonStyle} onPress={this._onPressButton}>
        <Text>Go to Card</Text>
      </TouchableOpacity>
    </View>
    );
  }
}

const styles = StyleSheet.create({
  buttonStyle: {
    padding: 10,
    borderRadius: 4,
    borderWidth: 0.5,
    borderColor: '#d6d7da',
    backgroundColor: 'blue'
  }
});

export { HelloWorld };
