package IO.lesson02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {

    public static void main(String[] args) throws IOException {
        //案例:拷贝图片和音频[优化一、这种方式在大文件下不建议使用]

        //1、文件输入流
        FileInputStream fis = new FileInputStream("C:/Users/asus/Desktop/IMG_0622.PNG");
        int size = fis.available();//返回文件长度
        System.out.println("文件的大小："+size);

        //2、现在一次读取文件大小的字节
        //2.1定义一个字节数组
        byte[] bytes = new byte[size];//相当于现在是一个空的杯子
        //2.2把数据读到字节数组中
        int r = fis.read(bytes);//这个方法的返回值读取到的实际长度
        System.out.println(r);

        //3、把字节数组一次性写到文件中去
        //3.1输出流
        FileOutputStream fos = new FileOutputStream("C:/Users/asus/Desktop/IMG_0622-副本.PNG");
        //3.2写数据
        fos.write(bytes);

        //4、关闭流
        fis.close();
        fos.close();






    }

}
