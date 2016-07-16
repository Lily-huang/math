package com.mengli.apps.sort;

import com.mengli.apps.utils.RandomUtil;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by mlhuang on 7/10/16.
 */
public class QuickSort {
    public static int[] quickSort(int[] array, int left, int right) {
        if (left < right) {
            int key = array[left];
            int low = left;
            int high = right;
            while (low < high) {
                while (low < high && array[high] > key) {
                    high--;
                }
                array[low] = array[high];
                while (low < high && array[low] < key) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = key;
            quickSort(array, left, low - 1);
            quickSort(array, low + 1, right);
        }
        return array;
    }

    public static void main(String args[]) {
        int[] array = quickSort(RandomUtil.getRandomNumList(8, 100), 0, 7);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
