package com.atguigu.java2;

/**只要没有字面量出现，就不会在字符串常量池中创建一个字符串
 *
 * 题目：
 * new string（"ab"）会创建几个对象？看字节码，就知道是两个。
 *      一个对象是：new关键字在堆空间创建的
 *      另一个对象是： 字符串常量池中的对象，字节码指令 ldc
 *
 * 思考：
 * new string("a") + new string("b")呢？
 * 1、new StringBuilder()
 * 2、new String("a")
 * 3、常量池中的a
 * 4、new String("b")
 * 5、常量池中的b
 *
 *      深入：StringBuilder的toString()
 *          6、new String("ab")
 *              StringBuilder的toString()的调用，在字符串常量池中，没有生成"ab"
 *
 *
 * @author shen_wzhong
 * @create 2022-03-29 10:56
 */
public class StringNewTest {
    public static void main(String[] args) {
//        String str = new String("ab");
        String str = new String("a")  + new String("b");
        Integer i = new Integer(1);
        i.toString();
        String s1 = new String();
    }
}
