package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author shen_wzhong
 * @create 2022-03-30 11:46
 */
public class GCRootsTest {
    public static void main(String[] args) {
        List<Object> numList = new ArrayList<>();
        Date brith = new Date();

        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据添加完毕，请操作：");
        new Scanner(System.in).next(); //在这里进行dump文件
        numList = null;
        brith = null;

        System.out.println("numList brith已置空，请操作：");
        new Scanner(System.in).next();//在这里进行dump文件

        System.out.println("结束");

    }
}
