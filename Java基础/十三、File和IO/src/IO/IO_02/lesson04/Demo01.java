package IO.IO_02.lesson04;

import java.io.*;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        /**
         * 带缓冲的字符流 BufferedReader&BufferedWriter
         * 1、这两个类，内部都有一个缓冲区，字符数组
         * 2、br.read()方法，内部会读8*1024个字符
         * 3、bw.writer(),内部会写8*1024
         *
         * 回顾：带缓冲的字节流：BufferedInputStream 和 BufferedOutputStream
         * 1、这两个类，内部都有一个缓冲区，字节数组
         */

        //需求：拷贝文件，a.txt -> b.txt
        FileReader fr = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson04/a.txt");
        BufferedReader br = new BufferedReader(fr);

        //2.创建writer
        FileWriter fw = new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson04/b.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //3.读取
        int c = 0;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }

        //4.关流
        br.close();
        bw.close();
    }

}
