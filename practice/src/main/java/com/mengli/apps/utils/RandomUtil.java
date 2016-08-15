package com.mengli.apps.utils;

import java.util.Random;

/**
 * Created by mlhuang on 7/2/16.
 */
public class RandomUtil {
    public static String[] getRandomUpChars(int num) {
        String[] array = new String[num];
        System.out.println("getRandomUpChars:");
        while (num > 0) {
            char ch = (char) (Math.random() * 26 + 'A');
            array[num - 1] = ch + "";
            System.out.print(ch + " ");
            num--;
        }
        System.out.println();
        return array;
    }

    public static String[] getRandomLowChars(int num) {
        String[] array = new String[num];
        System.out.println("getRandomLowChars:");
        while (num > 0) {
            char ch = (char) (Math.random() * 26 + 'a');
            array[num - 1] = ch + "";
            System.out.print(ch + " ");
            num--;
        }
        System.out.println();
        return array;
    }

    public static int[] getRandomNumList(int num, int range) {
        int[] array = new int[num];
        System.out.println("getRandomNumList:");
        Random r = new Random();
        while (num > 0) {
            int paramInt = r.nextInt(range);
            array[num - 1] = paramInt;
            System.out.print(paramInt + " ");
            num--;
        }
        System.out.println();
        return array;
    }
}
