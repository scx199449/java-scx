package IO.lesson07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 以后读纯文本文件使用FileReader类，因为我们不用考虑乱码问题
 *
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {
        test01();
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson07/new.txt");

        System.out.println(fis.read());
        fis.close();

    }

    public static void test01() throws IOException {
        //FileReader
        /**
         * FileReader 用于读取字符
         *
         */

        //1.创建对象
        FileReader reader = new FileReader("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson07/new.txt");

        //2.读取数据
        /*System.out.println((char)reader.read());
        System.out.println((char)reader.read());
        System.out.println((char)reader.read());
        System.out.println((char)reader.read());
        System.out.println((char)reader.read());*/

        int c;
        while ((c = reader.read()) != -1) {
            System.out.println((char)c);
        }

        //3.关闭流
        reader.close();
    }

}
