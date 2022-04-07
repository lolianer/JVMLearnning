package com.atguigu.java;

/**过程三：初始化阶段
 * @author shen_wzhong
 * @create 2022-04-07 16:57
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;
    public static String asd = new String("qwe");

    static {
        number = 2;
        System.out.println("father stayic{}");
    }
}
