package IO.IO_03.lesson04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        //对象操作流优化-思路：存多个对象时，把他们存在一个List对象中
        //案例：把对象存在List中，再把List写入文件[序列化/归档]

        //1.创建集合
        List<GirlFriend> list = new ArrayList<GirlFriend>();

        //2.添加对象
        list.add(new GirlFriend("XXX",1.75));
        list.add(new GirlFriend("XX",1.73));

        //3.list存入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson04/list.data"));
        oos.writeObject(list);

        //4.关流
        oos.close();
    }
}
