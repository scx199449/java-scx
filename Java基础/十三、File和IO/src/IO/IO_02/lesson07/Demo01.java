package IO.IO_02.lesson07;

import java.io.*;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //InputStreamReader&OutputStreamWriter
        //这两个类用于使用指定的码表读写字符

        //案例1：使用指定的码表(UTF-8&GBK)读取字符
        /**
         * charsetName:字符编码的名称
         */
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson07/a.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        //读一个字符
        System.out.println((char)isr.read());
        //读一行
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
    }

}
