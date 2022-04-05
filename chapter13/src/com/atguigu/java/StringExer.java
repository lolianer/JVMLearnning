package com.atguigu.java;

import java.util.Date;

/**
 * @author shen_wzhong
 * @create 2022-03-28 16:42
 */
public class StringExer {
    Date date = new Date(123);
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str, char[] ch,Date date) {
        str.toUpperCase();
        ch[0] = 'b';
        date = new Date(456);
    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();
        ex.change(ex.str, ex.ch, ex.date);
        System.out.println(ex.str);
        System.out.println(ex.ch);
        System.out.println(ex.date.getTime());
    }
}
