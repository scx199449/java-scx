package File.lesson02;

import java.io.File;
import java.io.FilenameFilter;

public class Demo07 {

    public static void main(String[] args) {
        //文件名称过滤器的概述及使用
        /*public String[] list(FilenameFilter filter)
        public File[] listFiles(FileFilter filter)*/
        //需求：判断指定目录下是否有后缀名为.PNG的文件，如果有，就输出该文件名称
        //test01();

        //1、创建一个文件对象
        File file = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a");

        File[] subFiles = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".PNG");
            }
        });

        for (File f : subFiles) {
            System.out.println(f.getAbsolutePath());
        }

    }

    public static void test01() {
        //1、创建一个文件对象
        File file = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a");

        //2、获取目录下所有子文件名称
       /* String[] subFilenames = file.list();
        for (String fn : subFilenames) {
            System.out.println(fn);
        }*/

        /**
         * FilenameFilter 文件名称过滤器
         */
        String[] subFilenames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".PNG");
            }
        });

        for (String fn : subFilenames) {
            System.out.println(fn);
        }
    }

}
