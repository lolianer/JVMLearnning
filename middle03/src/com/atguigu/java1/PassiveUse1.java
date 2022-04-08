package com.atguigu.java1;

import org.junit.jupiter.api.Test;

/**
 * @author shen_wzhong
 * @create 2022-04-08 11:47
 * 没有初始化的类，不意味着没有加载
 *
 * 关于类的被动使用，即不会进行类的初始化操作，即不会调用<clinit>()
 *
 * 1.当访问一个静态字段时，只有真正声明这个字段的类才会被初始化。
 */
public class PassiveUse1 {
    @Test//访问父类的静态字段，子类不会初始化
    public void test1() {
        System.out.println(Child.num);
    }

    @Test //创建一个类的数组，不会初始化这个类
    public void test2() {
        Parent[] parents = new Parent[10];
        System.out.println(parents.getClass());//class [Lcom.atguigu.java1.Parent;
        System.out.println(parents.getClass().getSuperclass());//数组的父类也是Object
    }
}
class Parent {
    static {
        System.out.println("Parent的初始化过程");
    }
    public static int num = 1;
}
class Child extends Parent {
    static {
        System.out.println("Child的初始化过程");
    }
}
