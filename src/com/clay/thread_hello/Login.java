package com.clay.thread_hello;

public class Login {
    private String username;
    private String password;

    public void  login (String username, String password) throws InterruptedException {
        this.username = username;
        if ("a".equals(username)) {
            Thread.sleep(2000);
        }
        this.password = password;
    }
    public void print() {
        System.out.println("username: " + this.username);
        System.out.println("password: " + this.password);
    }
}
