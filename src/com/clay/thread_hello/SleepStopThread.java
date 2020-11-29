package com.clay.thread_hello;

public class SleepStopThread {
    public static void main(String[] args) {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("停止咯");
                    e.printStackTrace();
                }
            }
        };
        threadA.start();
        threadA.interrupt();
    }
}
