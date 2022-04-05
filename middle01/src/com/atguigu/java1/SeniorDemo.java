package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-04-04 8:25
 */
public class SeniorDemo {
    private int num = 1;
    public final String info = "atguigu";
    boolean[] counts;

    public SeniorDemo() {
    }

    public SeniorDemo(int count) {
        this.counts = new boolean[count];
    }

    public String getInfo() {
        return info;
    }

    public void addNum(int n) {
        num += n;
        System.out.println(num);
    }
}
