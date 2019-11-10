package IO.IO_02.lesson09;

import java.io.File;

public class Demo02 {

    public static void main(String[] args) {
        //递归:文件目录
        /**
         * 打印出package1目录所有文件名称,包括子文件夹的文件
         */
        //1.创建一个目录对象
        File dir = new File("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_02/lesson09/package1");

        //2.打印目录的子文件
        printSubFile(dir);
    }

    public static void printSubFile(File dir){
        File[] subfiles = dir.listFiles();
        for (File f : subfiles) {
            if(f.isDirectory()){
                printSubFile(f);
            }else {
                System.out.println(f.getAbsolutePath());
            }
        }
    }



}
