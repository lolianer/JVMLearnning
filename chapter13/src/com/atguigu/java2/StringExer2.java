package com.atguigu.java2;

/**
 * @author shen_wzhong
 * @create 2022-03-29 15:52
 */
public class StringExer2 {
    public static void main(String[] args) {

        String s1 = new String("a") + new String("b");//执行完以后，不会在字符串常量池中会生成"ab"
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2); //true


        String s3 = new String("ab"); //执行完以后，会在字符串常量池中会生成"ab"
        s3.intern();
        String s4 = "ab";
        System.out.println(s3 == s4); //false
    }
}
