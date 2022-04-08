package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-07 17:05
 */
public class SubInitializationTest extends InitializationTest{
    static {
        number = 4;//number属性必须提前已经加载好   ：一定会先加载父类
        System.out.println("father stayic{}");
    }

    public static void main(String[] args) {
        System.out.println(InitializationTest.number);
        System.out.println(SubInitializationTest.asd == InitializationTest.asd);
    }
}
