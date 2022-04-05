package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-03-23 9:54
 */
public class operandStackTest {
    public void testAddOperation() {
        //byte、short、char、boolean：都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;

        int m = 128;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        int sum = getSum();
        int j = 10;
    }

    public void add() {
        //1.
        int  i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //2.
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        //3
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        //4
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
