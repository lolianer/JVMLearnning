package com.atguigu.java2;

/**标量替换测试
 * @author shen_wzhong
 * @create 2022-03-25 15:10
 */
public class ScalarReplace {
    public static class User{
        public int id;
        public String name;
    }

    public static void alloc(){
        User u = new User();
        u.id = 5;
        u.name = "qwe";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + "ms");
    }
}

/*
class Customer{
    String name;
    int id;
    Account acct;
}

class Count{
    double balance;
}
 */
