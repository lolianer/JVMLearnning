package com.atguigu.java1;

/**自定义类的加载器
 * @author shen_wzhong
 * @create 2022-04-09 16:37
 */
public class MyClassLoader extends ClassLoader{
    private String rootDir;

    public MyClassLoader(String roootDir) {
        this.rootDir = roootDir;
    }

    /*@Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = this.findLoadedClass(name);
        FileChannel fileChannel = null;
        WritableByteChannel outChannel = null;
        if (null == clazz) {
            try {
                String classFile = getClassFile(name);
                FileInputStream fis = new FileInputStream(classFile);
                fileChannel = fis.getChannel();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                outChannel = Channels.newChannel(baos);
                ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return super.findClass(name);
    }*/
}
