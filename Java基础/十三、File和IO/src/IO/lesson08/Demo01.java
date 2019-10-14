package IO.lesson08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //字符流的拷贝
        //思路：用FileReader读字符，用FileWiter写字符
        //E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/a.txt
        //Test01();

        FileReader reader = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/a.txt");

        //2.创建写入流对象
        FileWriter writer = new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/b.txt");

        //3.读取和写入
        char[] buf = new char[8 * 1024];
        int len = 0;
        while ((len = reader.read(buf)) != -1 ) {
            writer.write(buf,0,len);
        }
        return;

    }

    public static void Test01() throws IOException {
        //1.创建读取流对象
        FileReader reader = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/a.txt");

        //2.创建写入流对象
        FileWriter writer = new FileWriter("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson08/b.txt");

        //3.读取和写入
        int c = 0;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }

        //4.关闭流
        reader.close();
        writer.close();
    }

}
