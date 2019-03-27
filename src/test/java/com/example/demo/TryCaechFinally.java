package com.example.demo;

/**
 *   try  catch finally 关键字学习
 */
public class TryCaechFinally {
    public static void main(String[] args) {
        test4();
    }

    /**
     *  try中有return语句，finally中没有return 语句。
     * @return
     */
    private  static  int   test0(){
        int num = 10;

        try{
            System.out.println("try");
            return  num += 80;
        }catch (Exception e){
            System.out.println("error!");
        }finally {
            if (num > 20){
                System.out.println("num > 20 :"+ num);
            }
            System.out.println("finally!");
        }
        return  0;
    }

    /**
     *  try中有return语句，finally中没有return 语句。
     * @return
     */
    private  static  int   test1(){
        int num = 10;
        try{
            System.out.println("try");
            num = num +80;
            return  num;
        }catch (Exception e){
            System.out.println("error!");
        }finally {
            if (num > 20){
                System.out.println("num > 20 :"+ num);
            }
            System.out.println("finally!");
        }
        return  0;
    }
    /**
     *  try 和 finally 中均有return
     */
    private  static int test2(){
        int num = 10;
        try{
            System.out.println("try");
            return  num += 80;
        }catch (Exception e){
            System.out.println("error");
        }finally {
            if (num > 20){
                System.out.println("num > 20 :"+num);
            }
            System.out.println("finally");
            num = 100;
            return  num;
        }
        // try 中的return语句被拆分了，finally中的return语句优先于try中的return语句执行，所以try z中的return语句不会执行。
    }

    private  static int test3(){
        int num = 10;
        try {
            System.out.println("try");
            return  num;
        }catch (Exception e){
            System.out.println("error");
        }finally {
            if (num > 20){
                System.out.println("num > 20 :"+ num);
            }
            System.out.println("finally !");
            num =  100;
        }
        return  num;
    }

    private static TryCatchNum  test4(){
            TryCatchNum  tryCatchNum = new TryCatchNum();
            try {
                System.out.println("try!");
                return  tryCatchNum;
            }catch (Exception e){
                System.out.println("error!");
            }finally {
                if (tryCatchNum.num > 20){
                    System.out.println("num > 20 :"+ tryCatchNum.num);
                }
                System.out.println("finally!");
                tryCatchNum.num = 100;
            }
            return  tryCatchNum;
    }

}
