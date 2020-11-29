package com.clay.thread_hello;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i++);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(2000);
        System.out.println("end");
    }
}
