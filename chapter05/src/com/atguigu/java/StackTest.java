package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-03-22 16:25
 */
public class StackTest {

    public void methodA() {
        int i = 10;
        int j = 50;

        methodB();

    }

    public void methodB() {
        int k = 60;
        int m = 40;
    }

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.methodA();
    }
}
