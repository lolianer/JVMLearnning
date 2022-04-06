package com.atguigu.java;

/**补充：方法调用指令的补充说明
 * @author shen_wzhong
 * @create 2022-04-06 9:30
 */
public class InterfaceMethodTest {
    public static void main(String[] args) {
        AA aa = new BB();//invokespecial
        aa.method2();// invokeinterface
        AA.method1();//invokestatic
        aa.cc();//invokeinterface
    }

}

interface AA {

    public static void method1() {

    }

    public default void method2() {

    }
    void cc();
}
class BB implements AA {
    public void cc() {}
}
