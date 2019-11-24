package IO.IO_03.lesson06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 随机访问流概述和读写数据
         * RandomAccessFile概述
         * RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。
         * 支持对随机访问文件的读取和写入。
         * 可用于文件断点下载
         */

        /**
         * 构造方法两个参数：
         * name:文件名称、路径
         * mode:模式，r（读）,w（写）
         */
        //1.创建一个随机访问流的对象，以只读的方式打开文件
        RandomAccessFile raf = new RandomAccessFile("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\src\\IO\\IO_03\\lesson06\\test.txt","rw");

        //2.读字符
        /**
         * 使用RandomAccessFile的readChar/readLine有乱码问题
         * 使用字节数组来读数据
         */
        byte[] buf = new byte[1024];
        int len;
        while ((len = raf.read(buf))!= -1){
            System.out.println(new String(buf,0,len));
        }

        //3.写数据
        //raf.writeChars("abc");
        //raf.writeBytes("abc");
        raf.seek(1);//指定位置
        raf.write(97);


    }
}
