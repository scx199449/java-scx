package IO.IO_01.lesson02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {

    public static void main(String[] args) throws IOException {
        //正确的拷贝文件的方法
        //拷贝图片和音频[优化二、这种方式开发中建议经常使用]
        /**
         * 1、每次只读取一个字节，太慢
         * 2、一次性读一个文件的所有数据，又怕内存溢出
         *
         * 3、最终解决方案：折中定义每次读8KB
         */

        //1、定义一个输入流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/EXID - 위아래.MP3");
        //2、定义一个输入流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/2.mp3");

        //定义一个8M的字节数组
        byte[] bytes = new byte[1024 * 1024 * 8];

        int len = 0;
        int i = 0;
        while ((len = fis.read(bytes)) != -1) {
            i++;
            fos.write(bytes,0,len);
        }

        System.out.println("读取次数："+i);
        //关闭流
        fis.close();
        fos.close();

    }

}
