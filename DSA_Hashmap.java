package com.company;

import java.util.HashMap;
import java.util.Set;

public class DSA_Hashmap {
    public static void main(String[] args) {

        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("INDIA",140);
        hm.put("PAKISTAN",40);
        hm.put("CHINA",150);
//        System.out.println(hm);
        hm.put("INDIA",145);
        hm.put("CHINA",200);
        System.out.println(hm);
        System.out.println(hm.get("INDIA"));
        System.out.println(hm.get("UTOPIA"));
        System.out.println(hm.containsKey("INDIA"));
        System.out.println(hm.containsKey("CHINA"));



        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }
    }
}
