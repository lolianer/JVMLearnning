package com.atguigu.java1;

import com.sun.net.ssl.internal.ssl.Provider;
import sun.misc.Launcher;
import sun.security.util.CurveDB;

import java.net.URL;

/**
 * @author shkstart
 * @create 2022-03-22 10:53
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("***********启动类加载器******************");
        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

        //从上面的路径中随意选择一个类，来看看他的类加载器是什么：引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader); //null

        System.out.println("***************扩展类加载器********************");
        /*String exDir = System.getProperty("java.ext.dirs");
        String[] split = exDir.split(";");
        for (String path: split) {
            System.out.println(path);
        }*/
        //从上面的路径中随意选择一个类，来看看他的类加载器是什么：引导类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1); //sun.misc.Launcher$ExtClassLoader@4b67cf4d
    }
}
