package com.mengli.apps.findnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlhuang on 6/30/16.
 */
public class FirstDup {
    public static String getDup(ArrayList<String> nums){
        Map<String,Integer> map=new HashMap<>();

        for (String ch:nums){
            if(map.containsKey(ch)){
                return ch;
            }
            map.put(ch,1);
        }
        return "";
    }

    public static void main(String args[]){
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<15;i++){
            char paramChar = (char)(Math.random()*26 + 'a');
            arrayList.add(paramChar+"");
            System.out.print(paramChar+"");
        }
        System.out.println(" >>> First dup char is "+getDup(arrayList));
    }
}
