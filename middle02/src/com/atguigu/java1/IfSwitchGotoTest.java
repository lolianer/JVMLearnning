package com.atguigu.java1;

import org.junit.jupiter.api.Test;

/**指令7：控制转移指令
 * @author shen_wzhong
 * @create 2022-04-06 11:58
 */
public class IfSwitchGotoTest {
    //1.条件跳转指令
    public void compare1() {
        int a = 0;
        if (a == 0) {
            a = 10;
        } else {
            a = 20;
        }
    }

    public boolean compareNull(String str) {
        if (str == null) {
            return true;
        } else {
            return false;
        }
    }

    //结合比较指令
    public void compare2() {
        float f1 = 9;
        float f2 = 10;
        System.out.println(f1 < f2);
    }

    public void compare3() {
        int i1 = 10;
        long l1 = 20;
        System.out.println(i1 < l1);
    }

    public int compare4(double d) {
        if (d > 50.0) {
            return 1;
        } else {
            return 0;
        }
    }

    //2.比较条件跳转指令
    public void ifCompare1() {
        int i = 10;
        int j = 20;
        System.out.println(i < j);
    }

    public void ifCompare2() {
        short s1 = 9;
        byte b1 = 10;
        System.out.println(s1 > b1);
    }

    public void ifCompare3() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);
        System.out.println(obj1 != obj2);
    }

    //3.多条件分支跳转
    public void switch1(int select) {
        int num;
        switch (select) {
            case 1:
                num = 10;
                break;
            case 2:
                num = 2;
//                break;//这里去掉break;之后，指令中就没有goto指令，不会跳转
            case 3:
                num = 3;
                break;
            default:
                num = 40;
        }
    }

    @Test
    public void switch2() {
        int select = 500;
        int num;
        switch (select) {
            case 100:
                num = 10;
                break;
            case 500:
                num = 2;
//                break;//这里去掉break;之后，指令中就没有goto指令，不会跳转
            case 300:
                num = 3;
                break;
            default:
                num = 40;
        }
        System.out.println(num);
    }

    //jdk7新特性：引入String
    public void switch3(String season) {
        switch (season) {
            case "SPRING" :
                break;
            case "SUMMER" :
                break;
            case "AUTUMN" :
                break;
            case "WINTER" :
                break;
        }
    }

    //4.无条件跳转指令
    public void whileInt() {
        int i = 0;
        while (i < 100) {
            String s = "atguigu.com";
            i++;
        }
    }

    public void whileDouble() {
        double d = 0.0;
        while (d < 100.1) {
            String s = "atguigu.com";
            d++;
        }
    }

    public void printFor() {
        short i;
        for (i = 0;i < 100; i++) {
            String s = "atguigu.com";
        }
    }

    //思考：如下两个方法的操作有什么不同
    public void whileTest() {
        int i = 1;
        while (i <= 100) {
            i++;
        }
    }
    public void forTest() {
        for (int i = 0; i < 100; i++) {

        }
    }

    //更近一步
    public void doWhileTest() {
        int i = 1;
        do {
            i++;
        } while (i <= 100);
    }

}
