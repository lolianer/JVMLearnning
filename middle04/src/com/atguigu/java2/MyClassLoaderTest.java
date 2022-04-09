package com.atguigu.java2;

/**
 * @author shen_wzhong
 * @create 2022-04-09 17:44
 */
public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader("D:\\workspace\\idea\\JVMLearnning\\middle04\\src\\");

        try {
            Class<?> clazz = loader.loadClass("com.atguigu.java1.Demo1");
            System.out.println("加载此类的加载器为：" + clazz.getClassLoader().getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
