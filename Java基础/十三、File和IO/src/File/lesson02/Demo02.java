package File.lesson02;

import java.io.File;

public class Demo02 {

    public static void main(String[] args) {
        //File类的重命名功能
        /*删除功能：
            public boolean renameTo(File dest):把文件重命名为指定的文件路径

        重命名注意事项：
            如果路径名相同，就是改名。
            如果路径名不同，就是改名并剪切。*/

        //需求：把E:\Java复习项目\Java复习代码\Java基础\十三、File和IO\File\a\a.txt文件名改为hello.txt
        String pathname = "E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\a.txt";
        File file = new File(pathname);
        //File dest = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\hello.txt");
        File dest = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\b\\c\\d\\hello.txt");
        boolean b = file.renameTo(dest);
        System.out.println(b);



    }

}
