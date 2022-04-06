package com.atguigu.java1;

/**指令9：同步控制指令
 * @author shen_wzhong
 * @create 2022-04-06 16:01
 */
public class SynchronizedTest {
    private int i = 0;
    public synchronized void add() {
        i++;
    }

    private Object object = new Object();
    public void subtract() {
        synchronized (object) {
            i--;
        }
    }
}
