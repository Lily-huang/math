package com.mengli.apps.findnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mlhuang on 6/30/16.
 */
public class MostDup {
    public static String mostDup(ArrayList<String> nums) {
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        String mostStr = "";
        for (String ch : nums) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            if (index < entry.getValue()) {
                index = entry.getValue();
                mostStr = entry.getKey();
                System.out.println(mostStr + "-----" + index);
            }
        }
        if (index == 0) {
            return "";
        }
        return mostStr;
    }

    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            char paramChar = (char) (Math.random() * 26 + 'a');
            arrayList.add(paramChar + "");
            System.out.print(paramChar + "");
        }
        System.out.println();
        System.out.println(" >>> Most dup char is " + mostDup(arrayList));
    }
}
