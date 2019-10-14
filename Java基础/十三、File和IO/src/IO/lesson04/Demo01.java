package IO.lesson04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //字节流读写中文乱码问题
        //解决方案：java提供了一个类Reader（字符流）

        //1、读数据
        //创建文件输入流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson04/a.txt");

        //读数据
        //定义字节数组(缓冲区思想)
        /**
         * UTF-8中，一个中文3个字节，一个英文一个字节
         * GBK中一个中文2个字节
         */
        byte buf[] = new byte[2];
        int len = 0;
        while ((len = fis.read(buf)) != -1){
            System.out.println("len :"+len);
            //把字节转成字符串
            String s = new String(buf,0,len);
            System.out.println("s :"+s);
        }

    }

}
