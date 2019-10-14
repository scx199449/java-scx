package IO.lesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //流的标准处理异常代码1.6版本及其以前

        //案例：a.txt的内容拷贝到b.txt
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson05/a.txt");
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson05/b.txt");

        try {
            //读取数据会抛异常
            int b = 0;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }finally {
                fos.close();
            }
        }

    }

    public static void test01() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson05/a.txt");
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson05/b.txt");

        try {
            //读取数据会抛异常
            int b = 0;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
