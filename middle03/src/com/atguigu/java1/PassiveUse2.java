package com.atguigu.java1;

import org.junit.jupiter.api.Test;

/**
 * @author shen_wzhong
 * @create 2022-04-08 12:01
 * 3.引用常量不会触发此类或接口的初始化。因为常量在链接阶段就己经被显式赋值了。
 * 4.调用classLoader类的loadClass()方法加载一个类，并不是对类的主动使用，不会导致类的初始化。
 */
public class PassiveUse2 {
    @Test //调用person类的常量，不会初始化类,但是如果NUM是new出来的，设计了代码的运行，就会初始化了
    public void test1() {
        System.out.println(Person.NUM);
    }

    @Test
    public void test2() {
//        SerialA.method1();
    }

    @Test
    public void test3() {
        try {
            Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.java1.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Person {
    static {
        System.out.println("Person的初始化过程");
    }
    public static final int NUM = 1; //在链接阶段的准备环节就赋值为1了
}
interface SerialA {
    public static final Thread t = new Thread(){
        {
            System.out.println("SerialA的初始化");
        }
    };
    public static final int NUM = 1;

    public static void method1() {
        System.out.println("你好！");
    }
}
