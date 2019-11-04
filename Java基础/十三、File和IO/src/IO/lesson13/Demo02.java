package IO.lesson13;

import java.io.*;

import static java.lang.System.out;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //OutputStreamWriter
        /**
         * 使用指定的码表写入文件
         */
        //创建writer
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson13/b.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        //写
        bw.write("你好,IO流");
        bw.newLine();

        //关流
        bw.close();
    }

}
