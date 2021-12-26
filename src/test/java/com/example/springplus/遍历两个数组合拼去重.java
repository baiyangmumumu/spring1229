package com.example.springplus;

import java.util.*;

public class 遍历两个数组合拼去重 {
    public static void main(String[] args) {
        int[] a = {1, 2, 7, 4, 4, 2};
        int[] b = {1, 5, 5, 6};

        List list = new 遍历两个数组合拼去重().findsame(a, b);
        for (Object o : list) {
            System.out.println(o);
        }
    }


    private List findsame(int[] a, int[] b) {
        List list = new ArrayList();
        Map map = new HashMap();
        for (int i = 0; i < a.length; i++) {
            String temp = a[i] + "";
            map.put(temp, temp);

        }
        for (int i = 0; i < b.length; i++) {
            String temp = b[i] + "";
            map.put(temp, temp);

        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            list.add(key);
         //   System.out.println(key + value);
        }

        return list;
    }
}
