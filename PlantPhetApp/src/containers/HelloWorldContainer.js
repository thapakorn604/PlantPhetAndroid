/*@flow*/
import { HelloWorld } from '../components/main-components/HelloWorld';
import { connect } from 'react-redux';
import { sayHi } from '../actions/AppActions';

export const mapStateToProps = state => {
  return {
    msg: state.app.message
  };
};

const mapDispatchToProps = dispatch => {
  //Return Object
  return {
    sayHi: () => {
      dispatch(sayHi());
    }
  };
};


export default connect(mapStateToProps, mapDispatchToProps)(HelloWorld);
