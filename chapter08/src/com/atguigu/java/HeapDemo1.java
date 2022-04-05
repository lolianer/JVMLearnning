package com.atguigu.java;

/**
 * -Xms20m  -Xmx20m
 * @author shen_wzhong
 * @create 2022-03-23 18:46
 */
public class HeapDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start...");
        Thread.sleep(1000000);
        System.out.println("end...");
    }
}
