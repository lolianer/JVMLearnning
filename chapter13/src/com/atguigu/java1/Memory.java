package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-03-28 18:08
 */
//官方示例代码
class Memory {
    public static void main(String[] args) {//line 1
        int i = 1;//line 2
        Object obj = new Object();//line 3
        Memory mem = new Memory();//line 4
        mem.foo(obj);//line 5
    }//line 9

    private void foo(Object param) {//line 6
        String str = param.toString();//line 7
        String str2 = "java.lang.Object@677327b6";
        System.out.println(str);
        System.out.println(str == str2);
    }//line 8
}
