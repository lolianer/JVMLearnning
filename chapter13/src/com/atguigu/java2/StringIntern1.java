package com.atguigu.java2;


/**
 * @author shen_wzhong
 * @create 2022-03-29 15:23
 */
public class StringIntern1 {
    public static void main(String[] args) {
        //StringIntern.java的拓展
        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);//jdk6:false  jdk7之后:true



        String a = new String(new char[]{'1','1'});
        System.out.println(s4 == a);
    }
}
