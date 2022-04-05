package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2022-03-22 11:36
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            //获取ClassLoader的几种方法
            //1.clazz..getClassLoader() Class 的对象
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.通过线程可以获取上下文的加载器
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);
            //这个不是线程类的加载器
            ClassLoader classLoader1 = Thread.class.getClassLoader();
            System.out.println(classLoader1);

            //3.直接通过ClassLoader.getSystemClassLoader() 拿到系统类加载器
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
