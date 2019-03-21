package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaTest {

    public static void main(String[] args) {
        test3();
    }

    /**
     *  使用lambda表达式输出list
     */
    static void  test(){
        List<String> stringList = Arrays.asList("Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka","Jack Ma","Tom Wang");

//        使用 lambda 表达式和函数操作
        stringList.forEach((string) -> System.out.print(string + "--   "));

        System.out.println("使用双冒号操作符！");
//        在java 8中使用双冒号操作符
        stringList.forEach(System.out::print);
    }

    /**
     *  使用lambda表达式实现多线程
     */
    public  static   void test1(){
//        使用lambdas来实现 runnable接口
        System.out.println("");
        System.out.println("==================");
        System.out.println("使用lambdas来实现runnable接口！");

//        使用匿名内部类
        Runnable  thread1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Hello world!  one ");
            }
        };

//        使用lambda 表达式
        Runnable thread2 = () -> System.out.println(" Hello world two !");

        thread1.run();
        thread2.run();
    }

    /**
     *   使用lambda排序集合
     */
    static void  test10(){
        String[] stringList = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka","Jack Ma","Tom Wang"};

        Arrays.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        String[] stringList1 = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka","Jack Ma","Tom Wang"};
        Arrays.sort(stringList1,(String s1,String  s2) -> (s1.compareTo(s2)));
        Stream.of(stringList1).forEach(System.out :: print);
//        System.out.println(stringList1);
    }

    /**
     * lambda表达式练习使用
     */
    static void  test3(){
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };

        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };

//          for each语句输出 表达式
        System.out.println("输出所有程序员姓名：");
        javaProgrammers.forEach((mam) -> System.out.printf("%s  %s",mam.getFirstName(), mam.getLastName()));
        System.out.println();
        System.out.println("=================");
        phpProgrammers.forEach((php) -> System.out.printf("%s  %s",php.getFirstName(), php.getLastName()));


        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("给程序员加薪 5% :");
        Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());

        javaProgrammers.forEach(giveRaise);
        phpProgrammers.forEach(giveRaise);


        javaProgrammers.forEach((mam) -> System.out.printf("%s  %s     ====",mam.getFirstName(), mam.getSalary()));
        System.out.println();
        System.out.println();
        phpProgrammers.forEach((mam) -> System.out.printf("%s  %s     ====",mam.getFirstName(), mam.getSalary()));

        System.out.println();
        System.out.println();
        System.out.println("通过 filter() 显示月薪超过  $1200 的java人员！");
        javaProgrammers.stream()
                .filter((java) -> (java.getSalary() > 1200))
                .forEach((p) -> System.out.printf("%s %s;    ====", p.getFirstName(), p.getLastName()));

    }
}
