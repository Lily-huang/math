package com.mengli.apps.yanghui;

import java.util.ArrayList;

/**
 * Created by mlhuang on 6/30/16.
 */
public class Yanghui {

    public static void getRows(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (num < 1) {
            return;
        }

        for (int i = 0; i < num; i++) {
            arrayList.add(1);

            for (int j = i - 1; j > 0; j--) {
                arrayList.set(j, arrayList.get(j - 1) + arrayList.get(j));
            }

            for (int k = 0; k < arrayList.size(); k++) {
                System.out.print(arrayList.get(k) + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        getRows(5);
    }
}
