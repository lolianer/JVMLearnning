package com.atguigu.java;

/**
 * -Xms10m  -Xmx10m
 * @author shen_wzhong
 * @create 2022-03-23 18:45
 */
public class HeapDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start...");
        Thread.sleep(1000000);
        System.out.println("end...");
    }
}
