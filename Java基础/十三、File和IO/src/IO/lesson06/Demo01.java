package IO.lesson06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //练习:图片加密

        //1.输入输出流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson06/1447312413.jpg");
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson06/1.jpg");

        //2.读写数据
        /**
         * 加密操作
         * 解密操作
         *
         * 一个数异或两次，数据不变
         */
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 5);
        }

        //3.关流
        fis.close();
        fos.close();

        System.out.println("图片加密完成");
    }

}
