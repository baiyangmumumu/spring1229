package com.example.springplus;

import java.util.Scanner;

public class 遍对称字符串 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String next = sc.next();
        StringBuilder s =new StringBuilder(next);
        StringBuilder reverse = s.reverse();
        String s1 = reverse.toString();

        if (next.equals(s1)){
            System.out.println(next+"是对称字符串");
        }else {
            System.out.println("不");
        }
    }
}
