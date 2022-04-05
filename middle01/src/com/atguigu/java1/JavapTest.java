package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-04-04 10:46
 */
public class JavapTest {
    private int num;
    boolean flag;
    protected char gender;
    public String info;

    public static final int COUNTS = 1;

    static {
        String url = "www.atguigu.com";
    }

    {
        info = "java";
    }

    public JavapTest() {
    }

    private JavapTest(boolean flag) {
        this.flag = flag;
    }

    private void methodPrivate() {

    }

    int getNum(int i) {
        return num + i;
    }

    protected char showGender() {
        return gender;
    }

    public void showInfo() {
        int i = 10;
        System.out.println(info + i);
    }

    public void foo(long l, float f) {
        {
            int i = 0;
        }
        {
            String s = "Hello World";
        }
    }
}
