package IO.IO_03.lesson08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //Properties的概述和作为Map集合的使用
        /**
         * Properties:属性
         * 1.Properties 类表示了一个持久的属性集。
         * 2.Properties 可保存在流中或从流中加载。
         * 3.属性列表中每个键及其对应值都是一个字符串
         */

        //遍历Properties所有属性和值
        //1.创建属性对象
        Properties p = new Properties();

        //2.关联文件
        p.load(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson08/info.properties"));

        //3.遍历一
        Set<Object> keys = p.keySet();
        for (Object key :keys){
            System.out.println(key + "=" +p.get(key));
        }
        System.out.println("============================");
        //4.遍历二
        for (Map.Entry<Object,Object> entry:p.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }



    }

    public static void test02() throws IOException {
        //使用Properties读取数据
        //1.创建属性对象
        Properties p = new Properties();

        //2.关联文件
        p.load(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson08/info.properties"));

        //3.通过key读数据
        String name = p.getProperty("username");
        String hometown = p.getProperty("hometown");
        String city = p.getProperty("city");
        System.out.printf("username :%s \nhometown :%s \ncity :%s",name,hometown,city);
    }

    public static void test01() throws IOException {
        //1.创建属性对象
        Properties p = new Properties();

        //2.存数据
        p.setProperty("username","scx");
        p.setProperty("city","成都");
        p.setProperty("hometown","泸州");

        //3.关联文件
        /**
         *
         */
        p.store(new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson08/info.properties"),null);
    }
}
