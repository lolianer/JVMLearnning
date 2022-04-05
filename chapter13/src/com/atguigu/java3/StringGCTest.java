package com.atguigu.java3;

/**
 * String 的垃圾回收
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGHCDetails
 * @author shen_wzhong
 * @create 2022-03-29 16:31
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i).intern();
        }
    }
}
