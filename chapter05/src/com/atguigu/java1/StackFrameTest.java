package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-03-22 17:05
 */
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
    }

    public void method1() {
        System.out.println("method1方法开始执行");
        method2();
        System.out.println("method1方法执行结束");
    }

    public int method2() {
        System.out.println("method2方法开始执行");
        int i = 10;
        int v = (int) method3();
        System.out.println("method2方法即将执行结束");
        return i + v;
    }

    public double method3() {
        System.out.println("method3方法开始执行");
        double j = 20.0;
        System.out.println("method3方法执行结束");
        return j;
    }
}
