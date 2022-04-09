package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-09 19:01
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());

        //获取系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());
        //获取平台类加载器
        System.out.println(ClassLoader.getPlatformClassLoader());

        //获取类的加载器的名字
        System.out.println(ClassLoaderTest.class.getClassLoader().getName() );
    }
}
