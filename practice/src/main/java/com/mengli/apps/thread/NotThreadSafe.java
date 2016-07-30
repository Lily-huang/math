package com.mengli.apps.thread;

import com.mengli.apps.utils.RandomUtil;

/**
 * Created by mlhuang on 7/24/16.
 */
public class NotThreadSafe {
    StringBuilder builder = new StringBuilder();

    public void add(String text) {

        int i = builder.toString().length();
        System.out.println(builder.toString().length());
        try {
            Thread.sleep(RandomUtil.getRandomNumList(1, 1000)[0]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.builder.append(text);

        int j = builder.toString().length();
        System.out.println(builder.toString().length());
        if (j - i != 2)
            System.out.println("+++++++++one++++++++++");
    }
}

