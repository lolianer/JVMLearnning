package com.atguigu.java;

/**演示栈中的异常情况
 * @author shen_wzhong
 * @create 2022-03-22 16:39
 *
 * 默认情况下：count: 11406
 * 设置栈大小： -Xss256k  2455
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
