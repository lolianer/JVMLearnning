package com.atguigu.java;

/**.
 * 成员变量（非静态）的赋值过程：
 * 1、默认初始化 2、显式初始化 / 代码块中初始化 3、构造器中初始化  4、有了对象以后，用对象改变成员变量的值
 *
 * @author shen_wzhong
 * @create 2022-04-02 10:12
 */
class Father {
    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }

    public void print() {
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father{
    int x = 30;

    public Son() {
        this.print();
        x = 40;
    }

    public void print() {
        System.out.println("Son.x = " + x);
    }
}
public class SongTest {

    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}
