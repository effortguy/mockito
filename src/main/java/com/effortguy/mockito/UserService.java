package com.effortguy.mockito;

public class UserService {

    public User getUser() {
        return new User("effortguy", "1234");
    }

    public int getLoginErrNum() {
        return 1;
    }
}