package IO.IO_01.lesson01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {

//        概述
//        FileInputStream 从文件系统中的某个文件中获得输入字节。FileInputStream 用于读取诸如图像数据之类的原始字节流。
//        要读取字符流，请考虑使用 FileReader

//        构造方法
//        FileInputStream(File file)
//        FileInputStream(String name)

//        成员方法
//        int read() 从此输入流中读取一个数据字节

        //案例：读取txt文件内容
        //1、创建一个文件对象
        File file = new File("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a.txt");

        //2、创建一个文件输入流对象(读取文件数据)
        FileInputStream fis1 = new FileInputStream(file);

        //3、再创建一个文件输入流对象
        FileInputStream fis2 = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a.txt");

        //4、读取a.txt的数据
        /**
         * read方法每次读文件1个字节（byte）,把byte转为int返回
         * 当读到最后的时候，返回-1，-1表示读取文件结束
         */
        System.out.println(fis1.read());
        System.out.println(fis1.read());

        //5、关闭流，释放资源
        fis1.close();
        fis2.close();

    }

}
