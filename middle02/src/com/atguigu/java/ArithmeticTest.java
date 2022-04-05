package com.atguigu.java;


import org.junit.jupiter.api.Test;

/**
 * @author shen_wzhong
 * @create 2022-04-05 9:04
 */
public class ArithmeticTest {
    @Test
    public void method1() {
        int i = 10;
        double j = i / 0.0001;
        System.out.println(j);//Infinity,无穷大

        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2);//NAN，不确定的数
    }

    public void method2() {
        float i = 10;
        float j = -i;
        i = -j;
    }

    public void method3() {
        int i = 100;
        i = i + 10;
        i += 10;
    }

    public int method4() {
        int a = 80;
        int b = 7;
        int c = 10;
        return (a + b) * c;
    }

    public int method5(int i, int j) {
        return ((i + j -1) & ~(j -1)); //~是按位取反操作
    }

    public static int bar(int i) {
        return ((i + 1) - 2) * 3 / 4;
    }

    public void add() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    //关于前++ 和 后++
    public void method6() {
        int i = 10;
        i++;
        ++i;
    }

    public void method7() {
        int i = 10;
        int a = i++;

        int j = 20;
        int b = ++j;
    }

    public void method8() {
        int i = 10;
        i = i++;
        System.out.println(i);
    }
}
