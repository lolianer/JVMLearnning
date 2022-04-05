package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-02 9:51
 */
public class StringTest {
    public static void main(String[] args) {
        //复制一份，一份用于给构造器里面的this，一份是给引用变量
        String str = new String("hello") + new String("world");
        String str1 = "helloworld";
        System.out.println(str == str1);
    }
}
