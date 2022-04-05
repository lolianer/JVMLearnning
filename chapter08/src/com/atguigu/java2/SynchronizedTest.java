package com.atguigu.java2;

/**
 * @author shen_wzhong
 * @create 2022-03-25 15:03
 */
public class SynchronizedTest {
    public void f () {
        Object hollis = new Object();
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}
