package com.mengli.apps.thread;

/**
 * Created by mlhuang on 7/24/16.
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Count count = new Count();
        int plus = 1;
        for (int i = 0; i < 1000; i++) {
            new Thread("" + i) {
                public void run() {
                    count.add(plus);
                    System.out.println("Thread: " + getName() + "running");
                }
            }.start();
        }
        System.out.println("******" + count.count);
    }
}
