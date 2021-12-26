package com.example.springplus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test{
//    /**
//     * 获取两个整型数组之间的重复元素集合
//     * @param array1 数组参数1
//     * @param array2 数组参数2
//     * @return
//     */

    public List findSame(int array1[],int array2[]){
        List result=new ArrayList();//重复元素结果集合
        HashMap hashMap=new HashMap();//利用hashmap来寻找重复元素
        for(int i=0;i<array1.length;i++){//将第一个数组加入hashmap
            String temp=array1[i]+"";
            hashMap.put(temp,temp);
        }
        for(int i=0;i<array2.length;i++){//遍历第二个数组
            String temp=array2[i]+"";
            if(hashMap.get(temp)!=null){//在已经存在第一个数组所有元素的hashmap里寻找第二数组里的元素
                result.add(array2[i]);//将重复出现的元素加入结果集合
            }
        }
        return result;
    }

    public static void main(String args[]){
        long timeBegin=System.currentTimeMillis();
        int   a[]   =   {1,   6,   2,   8,   5,   8,   6,   9,   0};
        int   b[]   =   {4,   5,   4,   8,   7,   6,   2,   0};
                //获取重复元素集合
        List list=new Test().findSame(a, b);



        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
   }
}
