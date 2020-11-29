package com.clay.thread_hello;

public class StopThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10000; i++) {
                if (this.isInterrupted()) {
                    throw new InterruptedException();
                }
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("停下了");
            e.printStackTrace();
        }

    }
}
