package com.example.springplus;

public class 冒泡 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 12, 34, 6, 1};
        gettest(arr);
        int n = 12;
        int gettext = gettext(arr, n);
        System.out.println(gettext);

    }

    private static int  gettext(int[] arr, int n) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) >> 1;
            //mid指向的元素 > number
            if(arr[mid] > n){
                //表示要查找的元素在左边.
                max = mid -1;
            }else if(arr[mid] < n){
                //mid指向的元素 < number
                //表示要查找的元素在右边.
                min = mid + 1;
            }else{
                //mid指向的元素 == number
                return mid;
            }

        }

return -1;
    }


    private static void gettest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}

