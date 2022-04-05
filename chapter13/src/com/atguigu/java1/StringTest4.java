package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-03-28 17:55
 */
public class StringTest4 {
    public static void main(String[] args) {
        System.out.println();//2149
        System.out.println("1");//2150
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");//2159
        //如下的字符串"1" 到 "10"不会再次加载
        System.out.println("1");//2160
        System.out.println("2");//2160
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");//2160
    }
}
