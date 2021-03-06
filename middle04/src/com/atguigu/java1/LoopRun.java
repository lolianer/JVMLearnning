package com.atguigu.java1;


import java.lang.reflect.Method;

/**
 * @author shen_wzhong
 * @create 2022-04-09 16:50
 */
public class LoopRun {
    public static void main(String[] args) {
        while (true) {
            try {
                //1.创建自定义类加载器的实例
                UserClassLoader loader = new UserClassLoader("D:\\workspace\\idea\\JVMLearnning\\middle04\\src");
                //2.加载指定的类
                Class<?> clazz = loader.findClass("com.atguigu.java1.Demo1");
                //3.创建运行时类的实例
                Object demo = clazz.newInstance();
                //4.获取运行时类中指定的方法
                Method m = clazz.getMethod("hot");
                //5.调用指定的方法
                m.invoke(demo);
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
