package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-03-23 10:39
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA() {
        System.out.println("methodA()...");
    }

    public void methodB() {
        System.out.println("methodB()...");

        methodA();

        num++;
    }
}
