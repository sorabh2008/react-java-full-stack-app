import { Console } from 'console';
import React from 'react';
import { store } from './main';
import { types } from './sagas/types';

function App() {
  const onGetDataButtonClick = () => {
    console.log("Button clicked");
    console.log(process.env.REACT_APP_BACKEND_URL);
    store.dispatch({type: types.APP_API_GETDATA_USERS, payload: 'this is the payload from app.tsx'});
    console.log(store.getState())
  }
  return (
    <div >
      Hello World!
      <input type="button" onClick={onGetDataButtonClick} value="Get Data"/>
    </div>
  );
}

export default App;
