package com.clay.thread_hello;

public class MyThread implements Runnable {
    private int count = 100;
    @Override
    public synchronized void run() {
        while (count > 0) {
            System.out.println(count);
            this.count--;
        }
    }
}
