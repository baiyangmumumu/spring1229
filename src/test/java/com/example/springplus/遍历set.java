package com.example.springplus;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.Iterator;

public class 遍历set {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>( );
hs.add("hello");
hs.add("world" );

        Iterator<String> iterator = hs.iterator();
//        while (){
//
//        }
        for (String h : hs) {
            System.out.println(h);
        }
    }
}
