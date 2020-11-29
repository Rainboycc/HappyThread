package com.clay.thread_hello;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new StopThread();
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}
