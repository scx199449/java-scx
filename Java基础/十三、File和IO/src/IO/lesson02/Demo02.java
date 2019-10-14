package IO.lesson02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //案例:拷贝图片和音频[这种方式不建议使用，因为每一个字节就要读取一次]
        /**
         * 目的：结合输入流和输出流的使用
         *
         * 路径：C:/Users/asus/Desktop/IMG_0622.PNG
         */

        //1、创建文件输入流、输出流对象
        FileInputStream fis = new FileInputStream("C:/Users/asus/Desktop/IMG_0622.PNG");
        FileOutputStream fos = new FileOutputStream("C:/Users/asus/Desktop/img.PNG");

        //2、读取文件内容,并写入新文件
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //3、关闭文件输入输出流
        fis.close();
        fos.close();
    }

}
