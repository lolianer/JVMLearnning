package com.atguigu.java;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * IO       NIO(New IO / Non-Blocking IO)
 * IO : byte[]  / char[]   Stream
 * NIO :  Buffer            Channel
 *
 * 查看直接内存的占用与释放
 * @author shen_wzhong
 * @create 2022-03-26 16:12
 */
public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 1024;  //1GB

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕，请求指示！");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("直接内存开始释放！");
        byteBuffer = null;
        System.gc();
        scanner.next();
    }
}
