package com.example.springplus;

public class text {
    public static void main(String[] args) {

        int [] arr={5,6,7,9,3,2,6};
        getSort(arr);
int a =10;
Integer  b  =new Integer(a);
        System.out.println(a==b);

                System.out.println(12/3);
                System.out.println(12%5);
                System.out.println(12/3.0);
                System.out.println(12%5.0);

    }

    private static void getSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
        System.out.println();
}}
