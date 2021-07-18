import { types } from "../sagas/types";

export function fetchUsers(data: any) {
    return  { 
        type: types.APP_API_GETDATA_USERS,
        payload: data
    }
}


export function fetchUsersSuccess(users: any) {
    console.log(JSON.stringify(users));
    return  { 
        type: types.APP_API_GETDATA_USERS_SUCCESS,
        payload: users
    }
}

export function fetchUsersFailure(users: any) {
    return  { 
        type: types.APP_API_GETDATA_USERS_SUCCESS,
        payload: null,
        error: 'Something went wrong.'
    }
}