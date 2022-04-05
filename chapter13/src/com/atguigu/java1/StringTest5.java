package com.atguigu.java1;

import org.junit.Test;

/**
 * @author shen_wzhong
 * @create 2022-03-29 8:51
 */
public class StringTest5 {
    @Test
    public void test1() {
        String s1 = "a" + "b" + "c"; //等同于"abc"
        String s2 = "abc"; //"abc"一定是放在字符串常量池中的，将此地址赋给s2
        /*
        最终，java编译成class，再执行class
        String s1 = "abc"
        String s2 = "abc"
         */
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2));//true
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";

        //如果拼接符号的前后出现了变量，则相当于在堆空间中new string()，具体的内容为拼接的结果。 javaEEhadoop
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        //intern() :判断字符串常量池中是否存在javaEEhadoop值，如果要是存在，则返回常量池中javaEEhadoop的地址；
        //如果字符串常量池不存在javaEEhadoop，则在常量池中加载一份javaEEhadoop，并返回此对象的地址
        String s8 = s6.intern();
        String s9 = s6.toString();
        System.out.println(s3 == s8);//true
        System.out.println(s3 == s9);//true
    }

    @Test
    public void test3() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4); //false
    }

    /**
     * 1. 字符串拼接操作不一定使用的是StringBuilder!
     *      如果拼接符号左右两边都是字符串常量或常量引用，则仍然使用编译器优化，即非StringBuilder的方法
     * 2. 针对于final修饰类、方法、基本数据类型、引用数据类型的量的结构时，能使用上final的时候建议使用上
     */
    @Test
    public void test4() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4); //true
    }

    @Test
    public void test40() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        final String s4 = s1 + s2;  //这种情况是没有用的
        System.out.println(s3 == s4); //false
    }

    @Test
    public void test5() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3); //false

        final String s4 = "javaEE";
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5); //true
    }

    /*
    体会执行效率：通过StringBuilder的append()的方式拼接字符串的效率要远高于使用String的字符串拼接方式
    详情：①StringBuilder.append()的方式，自始自终只创建过一个对象
           使用String的字符拼接方式：创建过多的StringBuilder和String对象
         ② 使用String字符串拼接的方法：内存中由于创建了过多的StringBuilder和String的对象，内存占用的问题；
            如果进行GC，需要花费额外的时间

     改进空间：在实际开发过程中，如果基本确定前后添加的字符串长度不高于某个限定值highLevel的情况下，建议使用构造器
                StringBuilder s = new StringBuilder(highLevel);
     */
    @Test
    public void test6() {
        long start = System.currentTimeMillis();
//        method1(100000);//3364
        method2(100000);//2
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }

    public void method1(int highLevel) {
        String src = "";
        for (int i = 0; i < highLevel; i++) {
            src = src + "a"; //每次循环都会创建一个StringBuilder、String
        }
    }

    public void method2(int highLevel) {
        StringBuilder src = new StringBuilder(highLevel);
        for (int i = 0; i < highLevel; i++) {
            src.append("a");
        }
    }

}
