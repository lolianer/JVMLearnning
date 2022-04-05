package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms60m -Xmx60m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -Xloggc:./logs/gc.log
 * @author shen_wzhong
 * @create 2022-04-01 11:26
 */
public class GCLogTest {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100];
            list.add(arr);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
