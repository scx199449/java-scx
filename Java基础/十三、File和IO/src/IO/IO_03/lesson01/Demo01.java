package IO.IO_03.lesson01;

import java.io.*;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //SequenceInputStream 序列流
        /**
         * InputStream:输入流
         * Sequence: 序列 连续
         *
         * 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时,
         * 将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推
         */

        //需求：a.txt,b.txt 一次写入c.txt
        test01();
        test02();
    }

    public static void test02() throws IOException {
        //创建序列流
        FileInputStream fis1 = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/a.txt");
        FileInputStream fis2 = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/b.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

        //创建输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/c.txt");

        //读写
        int b = 0;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }

        //关流
        sis.close();
        fis2.close();
        fos.close();
    }

    public static void test01() throws IOException {
        //1、创建两个输入流
        FileInputStream fis1 = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/a.txt");
        FileInputStream fis2 = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/b.txt");

        //2.创建一个输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/c.txt");

        //3.先把a文件的内容写到c文件
        int b = 0;
        while ((b = fis1.read())!= -1) {
            fos.write(b);
        }

        fos.write("\r\n".getBytes());
        //4.再把b文件的内容写到c文件
        while ((b = fis2.read())!= -1) {
            fos.write(b);
        }

        //5.关流
        fis1.close();
        fis2.close();
        fos.close();
    }
}
