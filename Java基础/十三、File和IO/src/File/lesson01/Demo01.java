package File.lesson01;

import java.io.File;

public class Demo01 {

    public static void main(String[] args) {
        //File:表示一个文件或者路径
        /*构造方法
        1、File(String pathname)：
            根据一个路径得到File对象
        2、File(String parent, String child):
            根据一个目录和一个子文件/目录得到File对象
        3、File(File parent, String child):
            根据一个父File对象和一个子文件/目录得到File对象*/

        //路径的写法1:在java中需要在每一个斜杠前加一个斜杠，代表转义
        String pathname1 = "E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a.txt";
        //路径的写法2:可以把每个斜杠改成反斜杠
        String pathname2 = "E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a.txt";

        //1、创建一个文件对象   File(String pathname)
        File file1 = new File(pathname1); //文件对象已经关联了文件
        System.out.println("file1:"+file1);//重写了toString方法

        //2、创建一个文件对象 File(String parent, String child):
        File file2 = new File("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File","a.txt");
        System.out.println("file2:"+file2);

        //3、创建一个文件对象  File(File parent, String child):
        //3.1把文件夹封装成对象
        File fileFolder = new File("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File");
        File file3 = new File(fileFolder,"a.txt");
        System.out.println("file3:"+file3);
    }

}
