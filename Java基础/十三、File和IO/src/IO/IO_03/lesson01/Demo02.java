package IO.IO_03.lesson01;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //SequenceInputStream 序列流二

        //需求:把a.txt,b.txt,c.txt的内容拷贝到d.txt
        //

        //创建序列流
        //1.Vector是集合
        Vector<InputStream> vector = new Vector<InputStream>();
        vector.add(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/a.txt"));
        vector.add(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/b.txt"));
        vector.add(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/c.txt"));
        //2.Enumeration枚举
        Enumeration<InputStream> e = vector.elements();

        //3.序列流
        SequenceInputStream sis = new SequenceInputStream(e);

        //创建输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson01/d.txt");

        //读写
        int b = 0;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }

        //关流
        sis.close();
        fos.close();

    }

}
