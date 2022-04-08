package com.atguigu.java;

/**哪些场景下，java编译器就不会生成类构造器方法<clinit>()
 * @author shen_wzhong
 * @create 2022-04-08 8:48
 */
public class InitializationTest1 {
    //场景1:对于非静态的字段，不管是否进行了显式赋值，都不会生成<clinit>()
    public int num = 1;

    //场景2：静态的字段没有显式的赋值，也没有生成<clinit>()
    public static int num1;

    //场景3：对于声明为static final的基本数据类型，不管是否进行了显式赋值，都不会生成<clinit>()
    public static final int num2 = 1;


}
