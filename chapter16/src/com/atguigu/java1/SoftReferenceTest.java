package com.atguigu.java1;

import java.lang.ref.SoftReference;

/**软引用测试：内存不足就回收
 * @author shen_wzhong
 * @create 2022-03-31 9:20
 */
public class SoftReferenceTest {
    public static class User {
        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        //建立软引用
        SoftReference<User> userSoftRef = new SoftReference<>(new User(1,"qwe"));
        //等价于如下三行代码
        /*User user1 = new User(1,"qwe");
        SoftReference<User> userSoftRef = new SoftReference<>(user1);
        user1 = null;//取消强引用*/

        //从软引用中重新获得强引用对象
        System.out.println(userSoftRef.get());

        System.gc();
        System.out.println("After GC:");
        //垃圾回收之后再次尝试获得对象
        System.out.println(userSoftRef.get());//由于堆空间内存足够，所有不会回收软引用的可达对象

        try {
            //让系统内存资源紧张
//            byte[] b = new byte[1024 * (7168-600)];
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //垃圾回收之后再次尝试获得对象
            System.out.println(userSoftRef.get());//在报OOM之前，垃圾回收器会回收软引用可达对象
        }

    }
}
