package com.mengli.apps.findnum;

import com.mengli.apps.sort.MapValueSort;
import com.mengli.apps.utils.RandomUtil;

import java.util.*;

/**
 * Created by mlhuang on 6/30/16.
 */
public class MostDup {
    public static Map<String, Integer> getMap(String[] nos) {
        Map<String, Integer> map = new HashMap<>();
        for (String ch : nos) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static ArrayList<String> mostDupUsingCount(String[] nos) {
        Map<String, Integer> map = getMap(nos);
        int index = 0;
        ArrayList<String> result = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            if (index < entry.getValue()) {
                System.out.println("remove with count " + index);
                index = entry.getValue();
                result.clear();
            }
            if (index == entry.getValue()) {
                result.add(entry.getKey());
                System.out.println("add with " + entry.getKey() + "-----" + index);
            }
        }
        return result;
    }

    public static ArrayList<String> mostDupUsingSort(String[] nos) {
        Map<String, Integer> map = getMap(nos);
        Map<String,Integer> sortedMap=MapValueSort.getValueSortMap(map);
        ArrayList<String> result = new ArrayList<>();
        int count = 0;
        Iterator<Map.Entry<String, Integer>> entries = sortedMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            count = count == 0 ? entry.getValue() : count;
            if (entry.getValue() == count) {
                result.add(entry.getKey());
                System.out.println("add "+entry.getKey()+"----"+entry.getValue());
            } else {
                return result;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        String[] array = RandomUtil.getRandomLowChars(100);
        System.out.println();
        ArrayList<String> arrayList = mostDupUsingCount(array);
        System.out.println(" >>> Most dup char(using count) is ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<String> arrays = mostDupUsingSort(array);
        System.out.println(" >>> Most dup char(using sort) is ");
        for (String s : arrays) {
            System.out.print(s + " ");
        }
    }
}
