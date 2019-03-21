package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

//        1. 通过已有的集合来创建流
        List<String> strings = Arrays.asList("this","is","my","     ","house","Hello","world!");
        Stream<String> stream = strings.stream();
//        2.通过Stream创建流
        Stream<String> stream1 = Stream.of("this","is","my");

        strings.stream().forEach(System.out::print);
        System.out.println("-------------");
//        filter方法.通过设置条件过滤元素
        strings.stream().filter(string -> !string.isEmpty()).forEach(System.out :: print);

        System.out.println("===============");
        System.out.println("map方法测试！");
//        3 map方法。map方法用于映射每个元素对应的结果。
        List<Integer> numbers = Arrays.asList(12,10,3,6,9,1,3,10,0);
        numbers.stream().map( i -> i*i).forEach(System.out :: println);


        System.out.println("===============");
        System.out.println("limit方法测试！  打印前n个元素！");
//        4 limti / skip 方法。   limit(n)返回stream的前n个元素， skip(n)跳过streamd的前n个元素
        numbers.stream().limit(3).forEach(System.out :: println);
        System.out.println("===============");
        System.out.println("skip方法测试！  跳过前n个元素！");
        numbers.stream().skip(3).forEach(System.out :: println);


//        sort方法进行排序
        System.out.println("===============");
        System.out.println("sort方法，排序！");
        numbers.stream().sorted().forEach(System.out:: print);

//        distinct  方法去重
        System.out.println("===============");
        numbers.stream().forEach(System.out:: println);

        System.out.println("distainct方法，去重！");
        numbers.stream().distinct().forEach(System.out:: println);

//        stream的最终操作
//        for each
        Random random  = new Random();
        System.out.println("===============");
        System.out.println("随机生成20个数，然后排序输出。");
        random.ints().limit(20).sorted().forEach(System.out :: println);


//        count操作
        System.out.println("==========");
        System.out.println("count --   用来统计流中的元素个数！");
        System.out.println(numbers.stream().count());

//      collect操作
        strings = strings.stream().filter(string  -> string.startsWith("w")).collect(Collectors.toList());
        System.out.println(strings);
    }
}
