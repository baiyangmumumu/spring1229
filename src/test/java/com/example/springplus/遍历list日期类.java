package com.example.springplus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 遍历list日期类 {
    public static void main(String[] args) {
        List list =new ArrayList( );
        list.add("张三");
        list.add("李四");
        for (int i = 0; i < list.size(); i++) {

            String s = (String) list.get(i);
            System.out.println(s);
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        for (Object o : list) {

        }


//        Object remove = list.remove(1);
//        System.out.println(remove);
     String s =  "2021年12月20日 00:00:00";  //

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, dateTimeFormatter);
        LocalDateTime localDateTime = parse.plusDays(1000);
        System.out.println(localDateTime);



    }


}
