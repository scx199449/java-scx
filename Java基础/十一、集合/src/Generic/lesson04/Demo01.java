package Generic.lesson04;

import Generic.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        //使用泛型ArrayList存储学生对象并遍历
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("刘",23));
        list.add(new Student("李",23));
        list.add(new Student("王",23));

        //遍历
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }

}
