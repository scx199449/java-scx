package File.lesson02;

import java.io.File;

public class Demo04 {

    public static void main(String[] args) {
        //File类的判断功能
//        public boolean isDirectory():判断是否是目录
//        public boolean isFile():判断是否是文件
//        public boolean exists():判断是否存在
//        public boolean canRead():判断是否可读
//        public boolean canWrite():判断是否可写
//        public boolean isHidden():判断是否隐藏

        //1、创建文件对象
        File file1 = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\b");
        File file2 = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\b.txt");

        //2、判断file文件对象的类型
        System.out.println("file1是否为文件夹:"+file1.isDirectory());
        System.out.println("file1是否为文件："+file1.isFile());

        System.out.println("file2是否为文件夹:"+file2.isDirectory());
        System.out.println("file2是否为文件："+file2.isFile());

        //3、判断文件是否存在
        File file3 = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\c.txt");
        System.out.println("file3文件是否存在："+file3.exists());

        //4、判断是否可读[基本不用]
        System.out.println("file2是否可读："+file2.canRead());

        //5、判断是否可写
        System.out.println("file2是否可写:"+file2.canWrite());

        //6、判断是否隐藏
        System.out.println("file2是否隐藏:"+file2.isHidden());
    }

}
