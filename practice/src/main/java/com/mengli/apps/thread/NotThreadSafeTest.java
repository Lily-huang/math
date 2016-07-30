package com.mengli.apps.thread;

import com.mengli.apps.utils.RandomUtil;

/**
 * Created by mlhuang on 7/24/16.
 */
public class NotThreadSafeTest {
    public static void main(String[] args) {
        class MyRunnable implements Runnable {
            NotThreadSafe instance = null;
            int index=0;

            public MyRunnable(NotThreadSafe instance,int index) {
                this.instance = instance;
                this.index=index;
            }

            public void run() {
                this.instance.add("s ");
                System.out.println("*****"+this.index);
            }
        }

        NotThreadSafe notThreadSafe = new NotThreadSafe();
        for(int i=0;i<2000;i++) {
            new Thread(new MyRunnable(notThreadSafe,i)).start();
//            new Thread(new MyRunnable(notThreadSafe)).start();
        }
    }
}
