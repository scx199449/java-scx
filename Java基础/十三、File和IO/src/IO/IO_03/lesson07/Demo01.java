package IO.IO_03.lesson07;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //DataOutputStream&DataInputStream
        /*什么是数据输入输出流
        DataInputStream, DataOutputStream可以按照基本数据类型大小读写数据
        例如按Long大小写出一个数字, 写出时该数据占8字节. 读取的时候也可以按照Long类型读取, 一次读取8个字节*/
        //test01();
        DataInputStream dis = new DataInputStream(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson07/a.txt"));
        System.out.println(dis.readLong());
        System.out.println(dis.readLong());
        System.out.println(dis.readLong());

        dis.close();
    }

    public static void test01() throws IOException {
        long a = 997;
        long b = 998;
        long c = 999;

        //使用FileOutputStream没法写入Long数据
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson07/a.txt");

        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeLong(a);
        dos.writeLong(b);
        dos.writeLong(c);

        //关流
        dos.close();
    }
}
