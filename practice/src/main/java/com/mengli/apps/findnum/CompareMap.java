package com.mengli.apps.findnum;

import com.mengli.apps.utils.ValueComparator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by mlhuang on 8/15/16.
 */
public class CompareMap {
    public static boolean compareMap(Map<String, Integer> mapA, Map<String, Integer> mapB) {
        if (mapA.size() != mapB.size()) {
            return false;
        }
        TreeMap<String, Integer> sortedMapA = sortMap(mapA);
        TreeMap<String, Integer> sortedMapB = sortMap(mapB);
        Iterator<Map.Entry<String, Integer>> entriesA = sortedMapA.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> entriesB = sortedMapB.entrySet().iterator();
        while (entriesA.hasNext()) {
            entriesB.hasNext();
            Map.Entry<String, Integer> entryA = entriesA.next();
            Map.Entry<String, Integer> entryB = entriesB.next();
            System.out.println(entryA.getValue() + "****" + entryB.getValue());
            if (entryA.getValue() != entryB.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static TreeMap<String, Integer> sortMap(Map<String, Integer> map) {
        ValueComparator bvc = new ValueComparator(map);
        TreeMap<String, Integer> sorted_map = new TreeMap<>(bvc);
        sorted_map.putAll(map);
        return sorted_map;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();
        Map<String, Integer> mapC = new HashMap<>();
        mapA.put("a", 4);
        mapB.put("b", 5);
        mapA.put("b", 5);
        mapB.put("a", 4);
        mapC.put("b", 5);
        mapC.put("a", 3);

        System.out.println("A is " + mapA);
        System.out.println("B is " + mapB);
        System.out.println("C is " + mapC);

        System.out.println("compare A and B result is : " + compareMap(mapA, mapB));
        System.out.println("compare A and C result is : " + compareMap(mapA, mapC));
    }
}
