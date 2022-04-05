package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-04-03 10:06
 */
public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        System.out.println(arr);//[Ljava.lang.Object;@1b6d3586

        String[] arr1 = new String[10];
        System.out.println(arr1);

        long[][] arr2 = new long[10][10];
        System.out.println(arr2);
    }
}
