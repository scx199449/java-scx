package IO.IO_01.lesson03;

import java.io.*;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //BufferedOutputStream的flush和close方法的区别
        /*flush()方法
                用来刷新缓冲区的,刷新后可以再次写出
          close()方法
                用来关闭流释放资源的的,如果是带缓冲区的流对象的close()方法,不但会关闭流,还会再关闭流之前刷新缓冲区,
                关闭后不能再写出*/

        //案例:把a文件的内容拷贝到b文件中

        //1、输入流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson03/a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        //2、输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson03/b.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3、读写操作
        int b = 0;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        //bos.flush();用来刷新缓冲区的,刷新后可以再次写出

        //4、关闭流
        bis.close();
        bos.close();

    }

}
