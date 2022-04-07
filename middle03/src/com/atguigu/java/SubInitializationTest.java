package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-07 17:05
 */
public class SubInitializationTest extends InitializationTest{
    static {
        number = 4;
        System.out.println("father stayic{}");
    }

    public static void main(String[] args) {
        System.out.println(InitializationTest.number);
        System.out.println(SubInitializationTest.asd == InitializationTest.asd);
    }
}
