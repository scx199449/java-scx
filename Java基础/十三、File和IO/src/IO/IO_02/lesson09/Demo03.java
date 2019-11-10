package IO.IO_02.lesson09;

import java.io.File;
import java.util.Scanner;

public class Demo03 {

    public static void main(String[] args) {
        //练习:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.PNG文件名

        //1.获取文件路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String path = scanner.nextLine();

        //2.把路径封装成File对象
        File file = new File(path);
        if(!file.exists()){
            System.out.println("此路径不存在");
            return;
        }
        if (!file.isDirectory()){
            System.out.println("请输入文件夹路径");
            return;
        }

        //3.遍历文件夹下的文件
        printSubFile(file);
    }

    public static void printSubFile(File dir){
        File[] subfiles = dir.listFiles();
        for (File f : subfiles) {
            if(f.isDirectory()){
                printSubFile(f);
            }else {
                if (f.getName().endsWith(".PNG")){
                    System.out.println(f.getAbsolutePath());
                }

            }
        }
    }

}


