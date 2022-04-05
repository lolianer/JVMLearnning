package com.atguigu.java;

/**
 * -Xint ：3772ms
 * -Xcomp  :  345ms
 * -Xmixed  :  350ms
 * @author shen_wzhong
 * @create 2022-03-28 15:06
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        testPrimeNumber(1000000);
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            //计算100以内的质数
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (i % k == 0) {
                        break;
                    }
                }
            }
        }

       /* for (int i = 0; i < count; i++) {
            //计算100以内的质数
            label:for(int j = 2;j <= 100;j++){
                for(int k = 2;k <= Math.sqrt(j);k++){
                    if(j % k == 0){
                        continue label;
                    }
                }
                //System.out.println(j);
            }

        }*/
    }
}
