package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-03-21 17:09
 */
public class ClassInitTest {
    private static int num =1;

    static {
        num = 2;
        number = 20;
//        System.out.println(number);
    }

    private static int number = 10;//Linking之prepare:number =0-->initial：20 --10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num); //2
        System.out.println(ClassInitTest.number);///10
    }
}
