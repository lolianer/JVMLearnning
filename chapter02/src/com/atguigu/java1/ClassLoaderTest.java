package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2022-03-22 10:34
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层，扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1b6d3586

        //获取其上层，引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        //对于用户自定义类，他的加载器是什么: 默认使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //安全考虑，核心类不允许用自定义加载器，因为自定义加载器是JAVA，可以通过手段监控加载过程，会被注入恶意代码！
        //String类是使用引导类加载器进行加载的  ---> 核心类库
        ClassLoader classLoader1 = Integer.class.getClassLoader();
        System.out.println(classLoader1);//null
    }
}
