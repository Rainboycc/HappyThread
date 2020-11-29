package com.clay.thread_hello;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread threadA = new Thread(myThread, "A");
        Thread threadB = new Thread(myThread, "B");
        Thread threadC = new Thread(myThread, "C");
        Thread threadD = new Thread(myThread, "D");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
