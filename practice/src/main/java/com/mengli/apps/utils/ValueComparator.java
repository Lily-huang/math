package com.mengli.apps.utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlhuang on 7/2/16.
 */
public class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    @Override
    public int compare(String o1, String o2) {
        if (base.get(o1) >= base.get(o2)) {
            return -1;
        } else
            return 1;
    }
}
