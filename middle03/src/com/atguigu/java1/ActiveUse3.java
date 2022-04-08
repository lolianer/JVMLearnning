package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author shen_wzhong
 * @create 2022-04-08 11:14
 *
 * 4.当使用java.lang.reflect包中的方法反射类的方法时
 * 5.当初始化子类时
 * 6.如果一个接口定义了default方法，
 * 7.当虚拟机启动时，
 */
public class ActiveUse3 {

    static {
            System.out.println("ActiveUse3类的初始化过程");
    }

    @Test //反射，也可以执行初始化
    public void test1() {
        try {
            Class<?> clazz = Class.forName("com.atguigu.java1.Order");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test //调用static字段，会初始化子类，就会初始化父类，但不会初始化接口
    public void test2() {
        System.out.println(Son.num);
    }

    @Test //调用static字段，会初始化子接口，但是不会初始化父接口
    public void test3() {
        System.out.println(CompareC.NUM1);
    }

    @Test //调用static字段，会初始化子类，如果接口声明了default方法，就会初始化接口
    public void test4() {
        System.out.println(Son.num);
    }

    public static void main(String[] args) {//运行main方法，就会初始化当前类

    }
}

class Father {
    static {
        System.out.println("Father类的初始化过程");
    }
}

class Son extends Father implements CompareB{
    static {
        System.out.println("Son类的初始化过程");
    }
    public static int num = 1;
}

interface CompareB {
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareB的初始化");
        }
    };

    public default void method1() {
        System.out.println("你好！");
    }
}

interface CompareC extends CompareB{
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareC的初始化");
        }
    };
    public static final int NUM1 = new Random().nextInt(10);
}
