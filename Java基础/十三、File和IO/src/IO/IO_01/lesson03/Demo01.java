package IO.IO_01.lesson03;

import java.io.*;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        /*BufferedInputStream和BufferedOutputStream
         >这两个流是内置了缓冲区流,也就是说内部有一个字节数组
         >没有前面自己写的好用，因为内部每次只读取8KB的内容，无法修改
         */

        //1、创建缓冲输入流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        //2、创建缓冲输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a-副本.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3、输入流读数据，输出流写数据
        int b = 0;
        while ((b = bis.read()) != -1) {
            //System.out.println(b);
            bos.write(b);//内部会写8KB
            bos.flush();
        }

        //4、关流，只需要关缓冲流【内部会关文件输入流、输出流】，文件流不用关
        fis.close();
        fos.close();

    }

}
