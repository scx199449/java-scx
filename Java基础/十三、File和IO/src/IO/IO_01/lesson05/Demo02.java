package IO.IO_01.lesson05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo02 {

    public static void main(String[] args) throws Exception {
        //流的标准处理异常代码1.7版本
        /**
         * 1.把流对象的声明放在try()括号里
         * 2.操作流【读写数据】的代码放在花括号里
         * 3.这样写不用关闭流，java自动关闭
         * 4.在try的花括号里的对象，必须是实现AutoClosable的接口
         */
        try(
            FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson05/a.txt");
            FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson05/b.txt");

            //声明一个自己输入流
            MyInputStream mis = new MyInputStream();
         ) {
            int b = 0;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
    }

}

class Person {

}

class MyInputStream implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("我的输入流关闭了");
    }
}
