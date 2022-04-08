package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-04-08 10:00
 */
class staticA{
    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.atguigu.java1.staticB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("staticA init OK");
    }
}

class staticB{
    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.atguigu.java1.staticA");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("staticB init OK");
    }
}
public class StaticDeadLockMain extends Thread{
    private char flag;

    public StaticDeadLockMain(char flag) {
        this.flag = flag;
        this.setName("Thread" + flag);
    }

    @Override
    public void run() {
        try {
            Class.forName("com.atguigu.java1.static" + flag);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " over");
    }

    public static void main(String[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain('A');
        loadA.start();
        StaticDeadLockMain loadB = new StaticDeadLockMain('B');
        loadB.start();
    }
}
