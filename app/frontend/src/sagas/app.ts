import axios from 'axios';
import { put, takeEvery, all, call } from 'redux-saga/effects'
import { fetchUsersSuccess } from '../actions/app-actions';
import { types } from './types';


function* helloSaga() {
    yield takeEvery('LOG_HELLO', () => { console.log('hello') })
}

// notice how we now only export the rootSaga
// single entry point to start all Sagas at once
export default function* rootSaga() {
  yield all([
    helloSaga()
  ])
}