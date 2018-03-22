//Initial State
const INITIAL_STATE = {
};

const sayhi = (state, action) => {
  const msg = action.payload + " Bobby";
  return {...state, message:msg}
}

export default (state: Object = INITIAL_STATE, action) => {
  switch (action.type) {
    case 'SAY_HI':
      return sayhi(state, action);
    default:
  }
  return state;
};
