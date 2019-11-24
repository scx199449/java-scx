package IO.IO_03.lesson04;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //案例从list.data中读取所有对象[反序列化/解归档]

        //1.创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson04/list.data"));

        //2.读取List对象
        Object obj = ois.readObject();
        System.out.println(obj.getClass());

        //3.把obj转list
        List<GirlFriend> list = (List<GirlFriend>) obj;

        //4.遍历
        for (GirlFriend gf : list) {
            System.out.println(gf.toString());
        }

        //5.关流
        ois.close();
    }
}
