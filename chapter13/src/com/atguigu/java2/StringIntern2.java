package com.atguigu.java2;

/**
 * 使用intern()测试执行效率：空间使用
 *
 * 结论： 对于程序中，大量存在的字符串，尤其其中存在很多重复字符串时，使用intern()可以节省内存空间
 * @author shen_wzhong
 * @create 2022-03-29 16:07
 */
public class StringIntern2 {
    static final int MAX_COUNT = 1000 * 10000;
    static final String[] arr = new String[MAX_COUNT]; //声明一个常量，String[]长度1千万

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
//            arr[i] = new String(String.valueOf(data[i % data.length]));
            arr[i] = new String(String.valueOf(data[i % data.length])).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
