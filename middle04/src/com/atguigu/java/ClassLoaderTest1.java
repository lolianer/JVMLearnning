package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-08 17:41
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1b6d3586

        //试图获取引导类加载器，失败了
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null


        try {
            //获取加载String类的加载器
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);//null

            //自定义的类默认使用系统类加载器
            ClassLoader classLoader1 = Class.forName("com.atguigu.java.ClassLoaderTest1").getClassLoader();
            System.out.println(classLoader1);//sun.misc.Launcher$AppClassLoader@18b4aac2

            //关于数组类型的加载:使用的类的加载器和数组元素的加载器是一样的
            String[] arrStr = new String[10];
            System.out.println(arrStr.getClass());//class [Ljava.lang.String;
            System.out.println(arrStr.getClass().getClassLoader());//null,和数组中元素类型是一样的

            ClassLoaderTest1[] arr1 = new ClassLoaderTest1[10];
            System.out.println(arr1.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2

            int[] arr2 = new int[10];
            System.out.println(arr2.getClass().getClassLoader());//null:不需要类的加载器，有jvm自己创建

            System.out.println(Thread.currentThread().getContextClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
