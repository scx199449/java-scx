package IO.IO_03.lesson02;

import java.io.*;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //ByteArrayOutputStream字节数组输出流
        /**
         * 1.前面学习的流-必须关联一个文件
         *
         * 2.ByteArrayOutputStream 不需要关联文件
         * 此类实现了一个输出流，其中的数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。
         * 可使用 toByteArray() 和 toString() 获取数据。
         */

        //1.创建字节数组输出流对象
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        //2.输入流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson02/a.txt");

        //3.写入输出流
        int b = 0;
        while ((b = fis.read())!=  -1) {
            baos.write(b);
        }

        //自动把字节数组转为字符串
        System.out.println(baos.toString());

        //获取文件数据
        byte[] bytes = baos.toByteArray();
        System.out.println(new String(bytes));

        //4.关流
        fis.close();
    }

}
