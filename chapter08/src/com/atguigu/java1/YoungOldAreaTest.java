package com.atguigu.java1;

/**测试：大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * E: 16m  S0: 2m s1:2m O:40
 * @author shen_wzhong
 * @create 2022-03-25 10:09
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];  //20m
    }
}
