package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-04-02 9:40
 */
public class IntegerTest{
    static Integer i;
    public static void main(String[] args) {
        System.out.println(i);//null
        Integer x = 5;
        int y = 5;
        System.out.println(x == y);

        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2); //true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4); //false


    }
}
