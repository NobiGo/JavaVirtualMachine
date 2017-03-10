package com.chapter.two;

/**
 * Created by dx on 2017/3/10.
 */
public class ExampleTwoFor {
    private static int count = 0;

    public static void main(String[] args) {

        try {
            //不带参数
            recursion();
//            recursion(0,0,0);
        }catch(Throwable throwable){
            System.out.println("深度为："+count);
            throwable.printStackTrace();
        }
    }

    public static void recursion(long a,long b,long c){
        long e = 1,f = 2,g = 3,h = 4,i = 5,k = 6,q = 7,x = 8,y = 9,z = 10;
        count ++;
        recursion(a,b,c);
    }

    public static void recursion(){
        count++;
        recursion();
    }
    /**
     * 结果记录：带参数
     深度为：293
     java.lang.StackOverflowError
     *结果记录：不带参数
     * 深度为：1053
     *java.lang.StackOverflowError
     * java.lang.StackOverflowError
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:9)
     * 结论：不带参数比带参数可以执行更深的函数调用
     *
     */
}


