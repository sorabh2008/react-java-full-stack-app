// ...
import { combineReducers, createStore, applyMiddleware } from 'redux'
import createSagaMiddleware from 'redux-saga'

// ...
import rootSaga from './sagas/app'
import { types } from './sagas/types'

const sagaMiddleware = createSagaMiddleware()
const allReducers = combineReducers({ 
    users,
    counter
})
export const store = createStore(
    allReducers,
  applyMiddleware(sagaMiddleware)
)
sagaMiddleware.run(rootSaga)

const action = (type: any) => store.dispatch({type})

// rest unchanged
export interface IAction {
    type: string;
    payload?: any;
}
export function users(state: {}, action: IAction) {
    switch (action.type) {
        case types.APP_API_GETDATA_USERS:
            return state;
        default:
            return state;
    }
}
export default function counter(state = 0, action: any) {
    switch (action.type) {
      case 'INCREMENT':
        return state + 1
      case 'INCREMENT_IF_ODD':
        return (state % 2 !== 0) ? state + 1 : state
      case 'DECREMENT':
        return state - 1
      default:
        return state
    }
  }