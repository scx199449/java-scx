package File.lesson02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Demo05 {

    public static void main(String[] args) {
        //File类的获取功能
//        public String getAbsolutePath()：获取绝对路径
//        public String getPath():获取路径
//        public String getName():获取名称
//        public long length():获取长度。字节数
//        public long lastModified():获取最后一次的修改时间，毫秒值
//        public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
//        public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组

        //1、创建文件对象
        File file1 = new File("b.txt");

        //2、获取绝对路径
        System.out.println("file1的绝对路径是："+file1.getAbsolutePath());//就是构造方法传的路径

        //3、获取路径
        System.out.println("file1的路径是:"+file1.getPath());

        //4、获取名称
        System.out.println("file1的名称是："+file1.getName());

        //5、获取长度。字节数
        File file2 = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\b.txt");
        System.out.printf("file1的长度字节数为：%d",file2.length());

        //6、取最后一次的修改时间，毫秒值
        long time = file2.lastModified();
        System.out.println("file1的最后一次修改时间为:"+time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(time);
        System.out.println(sdf.format(date));

        //7、获取指定目录下的所有文件或者文件夹的名称数组
        File file3 = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a");
        System.out.println("file3下的所有文件、文件夹为:"+ Arrays.toString(file3.list()));

        //8、取指定目录下的所有文件或者文件夹的File数组
        File[] arr = file3.listFiles();
        for (File file :arr ) {
            System.out.println(file.getName());
        }

    }

}
