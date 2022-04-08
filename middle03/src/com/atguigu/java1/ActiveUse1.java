package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author shen_wzhong
 * @create 2022-04-08 10:26
 * 测试类的主动使用（有8种）：意味着会调用类的<clinit>()方法,即执行了类的初始化阶段
 *
 * 1.当创建一个类的实例时
 * 2.当调用类的静态方法时
 *
 */
public class ActiveUse1 {
    public static void main(String[] args) {
        Order order = new Order();//当创建一个类的实例时
    }

    //序列化过程
    @Test
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("order.data"));
            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //反序列化过程(验证):  反序列化也会执行了类的初始化阶段
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("order.data"));
            Order order = (Order) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {//调用类的静态方法,也会执行了类的初始化阶段
        Order.method();
    }
}
class Order implements Serializable{
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method() {
        System.out.println("Order类的method()");
    }
}
