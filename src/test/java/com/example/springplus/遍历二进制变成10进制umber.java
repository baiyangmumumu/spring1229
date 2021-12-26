
package com.example.springplus;

import java.util.Scanner;

public class 遍历二进制变成10进制umber {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个二进制数: "); 
        String temp = sc.nextLine(); 
        int two = Integer.parseInt(temp);    // 2进制
       // Integer.parseInt(temp,2);
        int eight = Integer.parseInt(temp, 8);  // 8进制 
        System.out.println("二进制转为十进制: " + two); 
        System.out.println("八进制转为十进制: " + eight);

    } 
} 