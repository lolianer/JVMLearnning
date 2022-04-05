package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:PrintCommandLineFlags : 展示所有命令行参数（包括使用的GC）
 *
 * -XX:UseSerialGC：表明新生代使用Serial GC，同时老年代使用Serial Old GC
 *
 * -XX:UseParNewGC：表明新生代使用ParNew GC
 * -XX:UseConcMarkSweepGC：表明老年代使用cmsGC
 *
 * -XX:UseParallelGC：表明新生代使用ParallelGC
 * -XX:UseParallelOldGC：表明老年代使用Parallel Old GC
 * 说明：两者可以相互激活
 *
 *-XX:+UseConcMarkSweepGC：表明老年代使用CMS GC，同时激活新生代触发 ParaNew GC
 * @author shen_wzhong
 * @create 2022-03-31 15:42
 */
public class GCUseTest {
    public static void main(String[] args) {
        List<byte[]> numList = new ArrayList<>();

        while (true){
            byte[] arr = new byte[100];
            numList.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
