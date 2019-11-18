package IO.IO_03.lesson03;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        /**
         * 面试题：
         * 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
         */

        //1.文件输入流
        FileInputStream fis = new FileInputStream("a.txt");
        //2.字节数组输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //3.字节数组【缓冲区思想】
        byte[] arr = new byte[5];
        int len;
        while ((len=fis.read())!=-1){
            //通过字节缓冲数组写入
            baos.write(arr,0,len);
            //把字节转为字符串
            /**
             * 中文乱码问题
             */
            System.out.println(new String(arr,0,len));
        }
        System.out.println(baos);//内部会直接调用toString方法
        fis.close();
    }

}
