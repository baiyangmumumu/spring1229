package com.example.springplus;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class text {
    public static void main(String[] args) {
        int [] a = {1, 2, 7, 4, 4, 2};
        int [] b = {1, 5, 5, 6};
        TreeSet<String> set =new TreeSet<>();

        LinkedList<String> list = new LinkedList<String>();
        HashMap<String,String> map =new HashMap();
        for (int i = 0; i < a.length; i++) {
            String temp= a[i]+"";
            list.add(temp); //

        }
        for (int i = 0; i < b.length; i++) {
            String temp= b[i]+"";
            list.add(temp);

        }
        for (String s : list) {
            set.add(s);
        }
        for (String s : set) {
            System.out.println(
                    s
            );
        }

    }
}
