package IO.lesson06;

import java.io.*;
import java.util.Scanner;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        //练习:根据用户输入的文件拷贝文件到当前项目目录

        //1.获取用户输入的文件路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件的路径[请不要输入文件夹路径]");
        String path = scanner.nextLine();

        //2.判断路径是否为文件
        File file = new File(path);
        if(file.isDirectory()){
            System.out.println("您输入的路径不是一个文件");
            return;
        }

        //3.如果是文件就拷贝
        //3.1 输入流
        FileInputStream fis = new FileInputStream(path);

        //3.2 输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/lesson06/"+file.getName());

        //3.3 读写
        byte[] buf = new byte[8 * 1024];

        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf,0,len);
        }

        //3.4 关流
        fis.close();
        fos.close();

        System.out.println("成功");
    }

}
