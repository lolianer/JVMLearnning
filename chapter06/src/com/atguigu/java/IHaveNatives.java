package com.atguigu.java;

/**
 * @author shen_wzhong
 * @create 2022-03-23 18:06
 */
public class IHaveNatives {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;
}
