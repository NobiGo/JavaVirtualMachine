package com.chapter.two;

/**
 * Created by dx on 2017/3/10.
 */
public class ExampleTwoThree {
    private static int count = 0;
    public static void recursion(){
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try{
            recursion();
        }
        catch(Throwable throwable){
            System.out.println(count);
            throwable.printStackTrace();
        }
    }

    /**
     * 初始输出：
     * 22100
     java.lang.StackOverflowError（栈内存溢出）
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:10)
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:10)
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:10)
     *
     * 当加入参数：-Xss256K（这个参数决定了函数调用的最大深度）
     *java.lang.StackOverflowError
     3531
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:10)
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:10)
     at com.chapter.two.ExampleTwoThree.recursion(ExampleTwoThree.java:10)
     */


}
