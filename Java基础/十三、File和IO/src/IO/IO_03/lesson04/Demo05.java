package IO.IO_03.lesson04;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * Serializable接口的ID:
         * 1.要归档或者序列化的对象必须实现Serializable接口才能被序列化
         * 2.Serializable 中有个id，但ID不是一定有加的
         * 3.SerialVersionUid，简言之，其目的是序列化对象版本控制，有关各版本反序列化时是否兼容。
         * 4.如果在新版本中这个值修改了，新版本就不兼容旧版本，反序列化时会抛出InvalidClassException异常。
         * 5.如果修改较小，比如仅仅是增加了一个属性，我们希望向下兼容，老版本的数据都能保留，那就不用修改；
         * 6.如果我们删除了一个属性，或者更改了类的继承关系，必然不兼容旧数据，这时就应该手动更新版本号，即SerialVersionUid。
         * 7.一般不添加id，就算添加了，版本号最好不要改
         */
        //save();
        //取学生对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson04/stu.data"));
        Student stu = (Student) ois.readObject();
        System.out.println(stu);


    }

    public static void save() throws IOException {
        //1.创建学生对象
        Student stu = new Student("sss");

        //2.把学生存入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/Java复习项目/Java复习代码/Java基础/十三、File和IO/src/IO/IO_03/lesson04/stu.data"));
        oos.writeObject(stu);

        //3.关流
        oos.close();
    }
}

class Student implements Serializable {

    /**
     * 序列化版本id
     */
    private static final long serialVersionUID = -3870989214131591512L;

    private String name;

    private String age;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
