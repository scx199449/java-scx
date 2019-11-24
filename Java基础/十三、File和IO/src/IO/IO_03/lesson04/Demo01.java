package IO.IO_03.lesson04;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象操作流ObjecOutputStream& ObjecInputStream
        /**
         * 对象操作流ObjecOutputStream：将一个对象写入文件
         *      1.使用这个类写入对象，需要这个对象序列化
         *      2.让对象实现Serializable接口
         *      3.不实现这个接口会报错
         * ObjecInputStream：从文件中读一个对象
         */
        //test01();

        //案例，从文件中去处对象
        //1.创建一个对象输入流
        FileInputStream fis = new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson04/gf.data");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //2.读数据
        GirlFriend gf1 = (GirlFriend) ois.readObject();
        System.out.println(gf1.toString());
        GirlFriend gf2 = (GirlFriend) ois.readObject();
        System.out.println(gf2.toString());
        /**
         * 如果没有数据可读，强制读取报错EOFException
         */

    }

    public static void test01() throws IOException {
        //案例：讲对象直接存入文件
        //1.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("XXX",1.75);
        GirlFriend gf2 = new GirlFriend("XX",1.73);

        //2.创建一个对象输出流
        FileOutputStream fos = new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson04/gf.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);


        //3.往文件中存入对象
        oos.writeObject(gf1);
        oos.writeObject(gf2);

        //4.关流
        oos.close();
    }
}

class GirlFriend implements Serializable {
    String name;
    double height;

    public GirlFriend(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
