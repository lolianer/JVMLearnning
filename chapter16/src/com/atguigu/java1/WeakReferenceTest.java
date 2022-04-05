package com.atguigu.java1;

import java.lang.ref.WeakReference;

/**弱引用测试：发现即回收
 * @author shen_wzhong
 * @create 2022-03-31 9:52
 */
public class WeakReferenceTest {
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
        //建立弱引用
        WeakReference<User> userWeakRef = new WeakReference<>(new User(1,"qwe"));
        //等价于如下三行代码
        /*User user1 = new User(1,"qwe");
        WeakReference<User> userSoftRef = new WeakReference<>(user1);
        user1 = null;//取消强引用*/

        //从弱引用中重新获得对象
        System.out.println(userWeakRef.get());

        System.gc();
        //不管当前内存空间是否足够，都会回收他
        System.out.println("After GC:");
        //垃圾回收之后再次尝试获得对象
        System.out.println(userWeakRef.get());//由于堆空间内存足够，所有不会回收软引用的可达对象



    }
}
