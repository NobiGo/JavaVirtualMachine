package com.chapter.two;

/**
 * Created by dx on 2017/3/10.
 */
public class ExampleTwoOne {
    public static void main(String[] args) {
        System.out.println("1");
        //输出参数
        for(int i= 0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("-Xms"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
    }

    /**
     * 输出分析：
     * 1
     * 123
     * 4576
     * 789
     * -Xms32M
     *32M为系统最大可用堆内存
     */


}
