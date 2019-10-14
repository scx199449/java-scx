package File.lesson02;

import java.io.File;

public class Demo06 {

    public static void main(String[] args) {
        /*案例:输出指定目录下指定后缀的文件名
        需求：判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称*/
        //test01();

        //1、打印E:\Java复习项目\Java复习代码\Java基础\十三、File和IO\File\a目录下所有的文件
        File file = new File("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a");

        //2、获取目录下所有子文件
        File[] files = file.listFiles();

        //3、遍历
        for (File f : files) {
            if(f.getName().endsWith(".PNG")){
                System.out.println(f.getAbsolutePath());
            }
        }
    }

    public static void test01() {
        //1、打印E:\Java复习项目\Java复习代码\Java基础\十三、File和IO\File\a目录下所有的文件
        File file = new File("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/File/a");

        //2、获取目录下所有子文件
        String[] filenames = file.list();

        //3、遍历
        for (String filename : filenames) {
            //判断后缀是否为.jpg
            if(filename.endsWith(".PNG")){
                System.out.println(filename);
            }
        }
    }

}
