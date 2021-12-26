package com.example.springplus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 遍历两个数主重复的数合并 {

    //
//    public List findSame(int array1[],int array2[]){
//        List result=new ArrayList();//重复元素结果集合
//        HashMap hashMap=new HashMap();//利用hashmap来寻找重复元素
//        for(int i=0;i<array1.length;i++){//将第一个数组加入hashmap
//            String temp=array1[i]+"";
//            hashMap.put(temp,temp);
//        }
//        for(int i=0;i<array2.length;i++){//遍历第二个数组
//            String temp=array2[i]+"";
//            if(hashMap.get(temp)!=null){//在已经存在第一个数组所有元素的hashmap里寻找第二数组里的元素
//                result.add(array2[i]);//将重复出现的元素加入结果集合
//            }
//        }
//        return result;
//    }
//
//    public static void main(String args[]){
//        long timeBegin=System.currentTimeMillis();
//        int   a[]   =   {1,   6,   2,   8,   5,   8,   6,   9,   0};
//        int   b[]   =   {4,   5,   4,   8,   7,   6,   2,   0};
//        //获取重复元素集合
//        List list=new Test().findSame(a, b);
//
//
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//    }
    public static void main(String[] args) {
        int a[] = {1, 6, 2, 8, 5, 8, 6, 9, 0};
        int b[] = {4, 5, 4, 8, 7, 6, 2, 0};
        List list = new 遍历两个数主重复的数合并().find(a, b);



        for (Object o : list) {
            System.out.println(o);
        }
    }

    private List find(int[] a, int[] b) {
        List  list = new ArrayList();
        Map map =new HashMap();
        for (int i = 0; i < a.length; i++) {
            String temp= a[i]+"";  //  String  temp = a[i]+""   map.put(temp,temp)
            map.put(temp,temp);

        }
        for (int i = 0; i < b.length; i++) {
            String temp =b[i]+"";
            if (map.get(temp)!=null){    //map.get(temp)!=nall){   list.add[b[i]];
                list.add(b[i]);
            }

        }

    return list;}


}
