package com.wf.java.bean;

public class UserService {
    public Boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    public void logout() {
        System.out.println("System exit");
    }
}
