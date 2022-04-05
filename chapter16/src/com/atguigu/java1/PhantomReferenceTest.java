package com.atguigu.java1;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**虚引用测试
 * @author shen_wzhong
 * @create 2022-03-31 10:00
 */
public class PhantomReferenceTest {
    //当前类对象的声明
    public static PhantomReferenceTest obj;
    //引用队列
    static ReferenceQueue<PhantomReferenceTest> phantomQueue = null;

    public static class CheckRefQueue extends Thread {
        @Override
        public void run() {
            while (true) {
                if (phantomQueue != null) {//没有用
                    System.out.println("执行");
                    PhantomReference<PhantomReferenceTest> objt = null;
                    try {
                        objt = (PhantomReference<PhantomReferenceTest>) phantomQueue.remove(); //这里会等待执行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (objt != null) {
                        System.out.println("追踪垃圾回收过程：PhantomReferenceTest实例被GC了");
                    } else {
                        System.out.println("objt是空的");
                    }
                }
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类的finalize()方法");
        obj = this;
    }

    public static void main(String[] args) {
        Thread t = new CheckRefQueue();
        t.setDaemon(true); //设置为守护线程
        t.start();

        phantomQueue = new ReferenceQueue<>();
        obj = new PhantomReferenceTest();

        //构造了PhantomReferenceTest对象的虚引用，并指定了引用队列
        PhantomReference<PhantomReferenceTest> phantomRef = new PhantomReference<PhantomReferenceTest>(obj, phantomQueue);

        try {
            //不可获取虚引用中的对象
            System.out.println(phantomRef.get());

            //将强引用去除
            obj = null;

            //第一次进行GC，由于对象可复活，GC无法回收对象
            System.gc();
            Thread.sleep(1000);
            if (obj == null) {
                System.out.println("obj 是 null");
            } else {
                System.out.println("obj 可用");
            }

            System.out.println("第二次gc");
            obj = null;
            System.gc(); //在这里，真实回收对象，就会将此虚引用存放到引用队列中
            Thread.sleep(1000);
            if (obj == null) {
                System.out.println("obj 是 null");
            } else {
                System.out.println("obj 可用");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
