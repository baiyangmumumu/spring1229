package com.example.springplus;

public class 水仙花 {


        public static void main(String[] args) {
            int x, y, z;
            for (int i = 100; i <= 9999; i++) {
                x = i / 100;  //x= i/ 100    y  = i%100  /10    z =   i%10   xxx
                y = (i % 100) / 10;
                z = i % 10;
                if ((x * x * x) + (y * y * y) + (z * z * z) == i) {
                    System.out.println(i);
                }
            }
        }

    }