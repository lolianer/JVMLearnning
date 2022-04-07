package com.atguigu.java;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**过程一：加载阶段
 *
 * 通过Class类，获得了java.lang.String类的所有方法信息，并打印方法访问标识符、描述符
 * @author shen_wzhong
 * @create 2022-04-07 13:28
 */
public class LoadintTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            //获取当前运行时类的生命的所有的方法
            Method[] ms = clazz.getDeclaredMethods();
            for (Method m : ms) {
                //获取当前方法的修饰符
                //因为m.getModifiers()的返回值是int类型，
                // 但是一定会有一个Modifier的类，就可以想到这个类里有一个静态方法toString
                String mod = Modifier.toString(m.getModifiers());
                System.out.print(mod + " ");
                //获取方法的返回值类型
                //m.getReturnType()返回值是一个Class类型，所以这里使用的getSimpleName方法
                String returnType = m.getReturnType().getSimpleName();
                System.out.print(returnType + " ");
                //获取方法名
                System.out.print(m.getName() + "(");
                //获取方法的参数列表，形参的类型
                Class<?>[] ps = m.getParameterTypes();
                if (ps.length == 0) {
                    System.out.print(")");
                }
                for (int i = 0; i < ps.length; i++) {
                    char end = (i == ps.length - 1) ? ')' : ',';
                    //获取参数的类型
                    System.out.print(ps[i].getSimpleName() + end);
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
