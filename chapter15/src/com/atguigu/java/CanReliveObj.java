package com.atguigu.java;

/**
 * 测试Object类中Finalize()方法、即对象的finalization机制
 * @author shen_wzhong
 * @create 2022-03-30 10:41
 */
public class CanReliveObj {
    public static CanReliveObj obj; //类变量，属于GC Roots

    /**
     * 不能显式调用这个方法，
     * 1.这个方法只能调用一次
     * 2.GC时，会有Finalizer线程去调用这个方法
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize()方法");
        //让当前对象在finalize方法中与类变量的GC Roots建立联系
        obj = this;//在这里为类变量赋值this对象
    }

    public static void main(String[] args) {
        try {
            obj = new CanReliveObj();//1.新建一个对象，指向GC Roots
            //对象第一次成功拯救自己
            obj = null;//2.让GC Roots引用为空，这个对象就没有引用指向，应该要回收
            System.gc(); //此时就会调用垃圾回收器，尝试回收CanReliveObj对象，然后会触发finalize方法
            System.out.println("第一次 gc");
            //因为Finalizer线程优先级很低，暂停两秒等待
            Thread.sleep(2000);
            if (obj == null) { //如果触发finalize方法了，就会给GC Roots再次指向这个对象，那么obj就不是空的，说明这个对象还在
                System.out.println("obj id dead");
            } else {
                System.out.println("obj is still alive");
            }
            System.out.println("第二次 gc");
            //下面代码与上面的完全相同，但是finalize方法已经执行过了，所以不再自救成功
            obj = null;//再次让GC Roots引用为空
            System.gc();//再次调用垃圾回收器，尝试回收CanReliveObj对象，不再触发finalize方法
            //因为Finalizer线程优先级很低，暂停两秒等待
            Thread.sleep(2000);
            if (obj == null) {//不再触发finalize方法,obj就不会有引用，此时这个对象已经被回收
                System.out.println("obj id dead");
            } else {
                System.out.println("obj is still alive");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
