package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-03-30 17:03
 */
public class LocalVarGC {
    public void localVarGC1() {
        byte[] buffer = new byte[1024 * 1024 * 10];
        System.gc();
    }

    public void localVarGC2() {
        byte[] buffer = new byte[1024 * 1024 * 10];
        buffer = null;
        System.gc();
    }

    public void localVarGC3() {
        {
            byte[] buffer = new byte[1024 * 1024 * 10];
        }
        System.gc();
    }

    public void localVarGC4() {
        {
            byte[] buffer = new byte[1024 * 1024 * 10];
        }
        int value = 10;
        System.gc();
    }

    public void localVarGC5() {
        localVarGC1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC local = new LocalVarGC();
//        local.localVarGC5();
    }
}
