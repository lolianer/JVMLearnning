package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-08 16:06
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();//隐式加载

        try {
            Class<?> clazz = Class.forName("com.atguigu.java.User");//显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.atguigu.java.User");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
