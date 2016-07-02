package com.mengli.apps.sort;

import com.mengli.apps.utils.ValueComparator;

import java.util.*;

/**
 * Created by mlhuang on 7/2/16.
 */
public class MapValueSort {

    public static TreeMap<String, Integer> getValueSortMap(Map<String, Integer> givenMap) {
        ValueComparator bvc = new ValueComparator(givenMap);
        TreeMap<String, Integer> sorted_map = new TreeMap<>(bvc);
        System.out.println("unsorted map: " + givenMap);
        sorted_map.putAll(givenMap);
        System.out.println("results: " + sorted_map);
        return sorted_map;
    }

    public static void main(String qrgs[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 12);
        map.put("c", 8);
        map.put("d", 11);

        TreeMap<String, Integer> mapOut = getValueSortMap(map);
        Iterator<Map.Entry<String, Integer>> entries = mapOut.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
    }
}
