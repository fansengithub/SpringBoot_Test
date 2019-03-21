package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {
        System.out.println("qwe---");
        System.out.println("this is my Test");

        HashMap<String,String> hashMap = new HashMap<>();
        test(hashMap);


        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println(key + "," + value);
        }
    }
    static void  test(HashMap<String,String> hashMap){
        hashMap.put("123","abc");
        hashMap.put("6","www");

        System.out.println(" ___ ");
    }
}
