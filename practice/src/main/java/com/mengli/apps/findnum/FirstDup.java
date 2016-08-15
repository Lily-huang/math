package com.mengli.apps.findnum;

import com.mengli.apps.utils.RandomUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlhuang on 6/30/16.
 */
public class FirstDup {
    public static String getDup(String[] nums) {
        Map<String, Integer> map = new HashMap<>();

        for (String ch : nums) {
            if (map.containsKey(ch)) {
                return ch;
            }
            map.put(ch, 1);
        }
        return "";
    }

    public static void main(String args[]) {
        String[] array = RandomUtil.getRandomLowChars(15);
        System.out.println(" >>> First dup char is " + getDup(array));
    }
}
