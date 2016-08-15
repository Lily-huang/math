package com.mengli.apps.sort;

import com.mengli.apps.utils.RandomUtil;

/**
 * Created by mlhuang on 6/30/16.
 */
public class BinarySort {
    public static int[] binarySort(int[] array) {
        int left, right, no;
        int m, j, i;
        int n = array.length;
        for (i = 1; i < n; i++) {
            left = 0;
            right = i - 1;
            no = array[i];
            while (right >= left) {
                m = (left + right) / 2;
                if (no < array[m])
                    right = m - 1;
                else
                    left = m + 1;
            }
            for (j = i - 1; j >= left; j--)
                array[j + 1] = array[j];
            array[left] = no;
        }
        return array;
    }

    public static void main(String args[]) {
        int[] array = RandomUtil.getRandomNumList(15, 100);
        System.out.println(" >>> Sort num as ");
        int[] result = binarySort(array);
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}
