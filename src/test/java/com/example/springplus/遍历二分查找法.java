package com.example.springplus;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class 遍历二分查找法 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 10;
        int index = findone(arr, number);
        System.out.println(index);
    }

    private static int findone(int[] arr, int number) {
     int min =0 ;
     int max=arr.length-1;
     while (max>=min){
         int mid= (max+min)>>1;
         if (arr[mid]>number){
             max=mid-1;
         }else if (arr[mid]<number){
             min=mid+1;

         }else {
             return mid;
         }

     }


   return  -1; }
    }

//    private static int findone(int[] arr, int number) {
//        int max = arr.length - 1;
//        int min = 0;
//        while (max >= min) {
//            int mid = (max + min) >> 1;
//            if (arr[mid] > number) {
//                max = mid- 1;
//
//            } else if (arr[mid] < number) {
//                min = mid + 1;
//            } else {
//                return mid;
//            }
//
//
//        }
//        return -1;
//    }
//}
