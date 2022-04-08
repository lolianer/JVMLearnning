package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author shen_wzhong
 * @create 2022-04-08 10:45
 * 测试类的主动使用（有8种）：意味着会调用类的<clinit>()方法,即执行了类的初始化阶段
 *
 * 3.当使用类、接口的静态字段时（final修饰特殊考虑）
 */
public class ActiveUse2 {
    @Test //调用类的静态字段，执行了类的初始化阶段
    public void test1() {
        System.out.println(User.num2);
    }

    @Test
    public void test2() {
        System.out.println(CompareA.NUM1);//不会初始化CompareA
        System.out.println(CompareA.NUM2);//会初始化CompareA
    }
}

class User {
    static {
        System.out.println("User类的初始化过程");
    }
    public static int num = 1;
    public static final int num1 = 1; //调用这个字段，赋值都不在初始化过程，不会执行类的初始化
    public static final int num2 = new Random().nextInt(10);//这个字段的赋值需要初始化，所以就会执行类的初始化
}
interface CompareA {
    public static final Thread t = new Thread(){ //如果这个接口初始化了，就会为t字段赋值，就会执行代码段
        {
            System.out.println("CompareA的初始化");
        }
    };
    //这里public static final是灰色的原因是：interface的字段默认就是public static final的
    public static final int NUM1 = 1;

    public static final int NUM2 = new Random().nextInt(10);
}
