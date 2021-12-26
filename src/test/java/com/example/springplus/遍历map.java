package com.example.springplus;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 遍历map {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("一号老公", "一号老婆");
        map.put("2号老公", "2号老婆");
        map.put("3号老公", "3号老婆");
        map.put("4号老公", "4号老婆");
//        Set<String> strings = map.keySet();
//        for (String key : strings) {
//            String s = map.get(key);
//            System.out.println(
//                    key+""+s
//            );
//
//        }
       // Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + value);
//        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }

        double random = Math.random();
int a= 10>>1;
        System.out.println(a);
       // String code = RandomUtils.nextInt(100000, 999999) + "";

    }
}