package IO.IO_03.lesson05;

import java.io.InputStream;
import java.io.PrintStream;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 标准输入输出流概述和输出语句
         * 1.System.in是InputStream, 标准输入流, 默认可以从键盘输入读取字节数据
         * 2.System.out是PrintStream, 标准输出流, 默认可以向Console中输出字符和字节数据
         */
        InputStream is = System.in;//标准输入流
        PrintStream ps = System.out;//标准输出流

    }
}
