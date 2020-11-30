package com.clay.thread_hello;

public class unSafeThread {
    public static void main(String[] args) throws InterruptedException {
        final Login login = new Login();
        Thread threadA = new Thread(() -> {
            try {
                login.login("a", "aa");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread threadB = new Thread(() -> {
            try {
                login.login("b", "bb");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadA.start();
        threadB.start();
        Thread.sleep(4000);
        login.print();
    }
}
