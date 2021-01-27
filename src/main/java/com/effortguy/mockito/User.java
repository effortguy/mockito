package com.effortguy.mockito;

public class User {

    String id;
    String pw;
    long loginErrNum = 0;

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public long getLoginErrNum() {
        return loginErrNum;
    }

    public void setLoginErrNum(long loginErrNum) {
        this.loginErrNum = loginErrNum;
    }
}
