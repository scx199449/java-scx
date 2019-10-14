package IO.lesson02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        /**
         * FileOutputStream:表示文件输出流，用于往文件写内容
         *
         * 构造方法：
         * FileOutputStream(String name)
         * FileOutputStream(File file)
         *
         * 方法：
         * write(int b) //每次写一个字节
         * write(byte[] b) //一次写多个字节
         */

        //案例：往a.txt写个内容
        //1、创建一个文件输出流对象
        FileOutputStream fos = new FileOutputStream("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a.txt");

        //2、写数据
        /*fos.write(97);
        fos.write(98);
        fos.write(99);*/

        //一次性写多个字节
        byte[] bytes = {97,98,99,100,101};
        fos.write(bytes);

        //3、关闭流
        fos.close();
    }

}
