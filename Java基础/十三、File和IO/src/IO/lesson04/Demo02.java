package IO.lesson04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        /*字节流写入中文的问题
            1、字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组
            2、写出回车换行 write("\r\n".getBytes());*/

        //需求：往a.txt文件写中文

        //1、输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson04/a.txt");

        //2、写中文
        String s = "你好，Java";

        //把字段转转成字节数组
        fos.write(s.getBytes());

        //3、关闭流
        fos.close();
    }

}
