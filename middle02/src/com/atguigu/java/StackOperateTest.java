package com.atguigu.java;

import org.junit.jupiter.api.Test;

/**指令6：操作数栈管理指令
 * @author shen_wzhong
 * @create 2022-04-06 10:28
 */
public class StackOperateTest {
    public void print() {
        Object obj = new Object();
//        String info = obj.toString();
        obj.toString();//返回值没有引用去接，就会把返回值pop
    }
    //类似的
    public void foo() {
        bar();//返回值没有引用去接，就会把返回值pop
        Object obj = new Object();
    }
    public long bar() {
        return 0;
    }



    public long nextIndex() {
        return index++;
    }
    private long index = 1;


    private long aLong = 1;
    private int anInt = 1;
    @Test
    public void test() {
        //1.int 局部变量
        int i = 1;
        i = i++;//在局部变量表直接加成2以后，又通过栈顶的1再次赋值，结果是1
        //2.long 局部变量
        long l = 1;
        l = l++;//先在栈顶复制了一份，然后把上面的l加了1，赋值之后，又用没有加的l再次赋值
        //3.int 成员变量
        anInt = anInt++;//拿到2个this，拿到变量值，用掉1个，把变量值复制1份，插到下面，
                        // 然后对上面的变量值加1，赋值，再用没有加过的变量赋值
        //4.long 成员变量
        aLong = aLong++;
//        return index++;

        anInt++;

        System.out.println(i);
        System.out.println(l);
        System.out.println(anInt);
        System.out.println(aLong);
    }

}
