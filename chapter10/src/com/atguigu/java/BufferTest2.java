package com.atguigu.java;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shen_wzhong
 * @create 2022-03-26 17:07
 */
public class BufferTest2 {

    private static final int Buffer = 1024 * 1024 * 20; //200MB

    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();

        int count = 0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(Buffer);
                list.add(byteBuffer);
                count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(count);
        }
    }


}
