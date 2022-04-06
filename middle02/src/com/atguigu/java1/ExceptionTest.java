package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**指令8：异常处理
 * @author shen_wzhong
 * @create 2022-04-06 15:00
 */
public class ExceptionTest {
    public void throwZero(int i) {
        if (i == 0) {
            throw new RuntimeException("参数值为0");
        }
    }

    public void throwOne(int i) throws RuntimeException {
        if (i == 1) {
            throw new RuntimeException("参数值为1");
        }
    }

    public void throwArithmetic() {
        int i = 10;
        int j = i / 0;
        System.out.println(j);
    }

    public void tryCatch() {
        try {
            File file = new File("qwe");
            FileInputStream fis = new FileInputStream(file);
            String info = "hello!";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    //思考，如下的方法返回结果是多少
    public static String func() {
        String str = "hello";
        try {
            return str;
        } finally {
            str = "atguigui";
        }
    }

    public static void main(String[] args) {
        System.out.println(func());
    }
}
