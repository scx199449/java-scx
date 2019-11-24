package IO.IO_03.lesson05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         *  打印流的概述和特点
         *  一、什么是打印流
         * 1.该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
         * 2.System.out就是一个PrintStream, 其默认向控制台输出信息
         * 3.PrintStream和PrintWriter分别是打印的字节流和字符流
         */

        //1.打印的字节流[打印到控制台]
        PrintStream ps = System.out;
        ps.println("你好2020");//打印字符串
        ps.print(19.6);

        //2.打印的字符流
        /**
         * 1.PrintWriter调用打印的方法，控制台没有内容，内容写到文件中
         * 2.如果答应内容没达到缓冲区的上限是不会写入到文件中，此时需要调用flush方法
         * 3.需要关流
         */
        PrintWriter pw = new PrintWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson05/test.txt");
        pw.println("再见2019");
        pw.flush();
        pw.close();
    }
}
