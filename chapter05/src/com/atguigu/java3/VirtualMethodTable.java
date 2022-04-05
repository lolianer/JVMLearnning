package com.atguigu.java3;

/**
 * @author shen_wzhong
 * @create 2022-03-23 17:03
 */
interface Friendly {
    void sayHello();
    void sayGoodBye();
}
class Dog {
    public void sayHello() {

    }

    @Override
    public String toString() {
        return "Dog";
    }
}
class Cat implements Friendly {
    public void eat() {

    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodBye() {

    }
}
public class VirtualMethodTable {
}
