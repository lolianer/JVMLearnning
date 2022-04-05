package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shen_wzhong
 * @create 2022-03-28 14:42
 */
public class JITTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add("qwe");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
