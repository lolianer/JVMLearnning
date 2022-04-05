package com.atguigu.java2;

/**第一个练习题
 * @author shen_wzhong
 * @create 2022-03-29 15:42
 */
public class StringExer1 {
    public static void main(String[] args) {
        String s = new String("a") + new String("b");//new string（"ab"）
        //在上一行代码执行完以后，字符串常量池中并没有αb'
        String s2 = s.intern();//jdk6中：在串池中建一个字符串"ab”
                                //jdk8中：串池中没有创建字符串"ab”，而是创建一个引用，指向new string("ab)

        System.out.println(s2 == "ab");//true
        System.out.println(s == "ab");//false× 应该是true
    }
}
