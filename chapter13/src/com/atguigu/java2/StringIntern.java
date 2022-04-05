package com.atguigu.java2;

import org.junit.Test;

/**
 * 如何保证变量s指向的是字符串常量池中的数据
 * 有两种方式：
 * 方式1： String s = "abc";
 * 方式二：
 *        String s = new String("abc").intern();
 *        String s = new StringBuilder("abc").toString().intern();
 * @author shen_wzhong
 * @create 2022-03-29 10:28
 */
public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();//调用此方法之前，字符串常量池中已经存在了“1”
        String s2 = "1";
        System.out.println(s == s2); //jdk6:false  jdk7之后:false

        String s3 = new String("1") + new String("1");//s3变量记录的地址为：new String(11)
        //执行完上一行代码以后，字符串常量池中，是否存在“11“呢？答案：不存在！！
        s3.intern();//在字符串常量池中生成"11”。如何理解：jdk6：创建了一个新的对象"11”，也就有新的地址。
                    //                                  jdk7: 为了节省空间，此时常量中并没有创建"11”，而是创建一个指向雄空间中new string（"11“）的地址
        String s4 = "11";//变量记录的地址：使用的是上一行代码代码执行时，在常量池中生成的"11“的地址，因为上面常量池地址就是指向的堆中的new string（"11“）的地址，所有他们是相同的
        System.out.println(s3 == s4);//jdk6:false  jdk7之后:true
    }

    @Test
    public void test() {
        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);//jdk6:false  jdk7之后:true   1.8:单元测试是false:为什么
    }
}
