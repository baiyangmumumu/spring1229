package com.example.springplus;

import java.util.*;

public class 遍历重复的 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 8, 9, 10};
        int[] b = {3, 2, 7, 7, 5, 6, 7, 8, 9};
        List findone = new 遍历重复的().findone(a, b);
        List findSame = new 遍历重复的().findsame(a, b);
//        for (Object o : findone) {
//            System.out.println(o);
//        }
        for (Object s : findSame) {
            System.out.println(s);

        }
    }

    private List findsame(int[] a, int[] b) {
        List list = new ArrayList();
        Map<String, String> map = new HashMap();
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
            list.add(key);
        }


        return list;
    }



    private List findone(int[] a, int[] b) {
        List list = new ArrayList();
        Map map = new HashMap();
        for (int i = 0; i < a.length; i++) {
            String temp = a[i] + "";
            map.put(temp, temp);

        }
        for (int i = 0; i < b.length; i++) {
            String temp = b[i] + "";
            if (map.get(temp) != null) {
                list.add(b[i]);
            }
        }


        return list;
    }

}
