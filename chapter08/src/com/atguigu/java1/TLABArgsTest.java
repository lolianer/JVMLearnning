package com.atguigu.java1;

/**测试-XX:UseTLAB参数是否开启的情况
 * @author shen_wzhong
 * @create 2022-03-25 10:23
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
