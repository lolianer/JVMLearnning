package com.atguigu.java1;

/**
 * @author shen_wzhong
 * @create 2022-03-24 14:52
 */

/**
 * -Xms600m -Xmx600m
 * -XX:NewRatio：设置新生代与老年代的比例。默认值是2.
 * -XX：SurvivorRatio：设置新生代中Eden区与Survivor.区的比例
 * -XX：-UseAdaptivesizepolicy：关闭自适应的内存分配策略（暂时用不到）
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
