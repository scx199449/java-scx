package IO.IO_02.lesson01;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //FileWiter 写入字符流
        //案例：使用FileWriter往一个文件a.txt写内容

        //1.创建writer
        FileWriter writer = new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson01/a.txt");

        //2.写内容
        writer.write("你好！");
        writer.write("\r\n");
        writer.write("你好！");

        //3.关闭
        writer.close();
    }


}
