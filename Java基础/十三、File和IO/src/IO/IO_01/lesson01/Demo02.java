package IO.IO_01.lesson01;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //案例:读取一个txt文件数据(方法二)

        //1、创建文件输入流对象
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a.txt");

        //2、读取数据
        int b = 0;
        while ((b = fis.read()) != -1){
            System.out.println((char)b); //把int转为char类型
        }

        //3、关闭流,释放资源
        fis.close();
    }

}
