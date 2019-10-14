package List;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合的遍历方式
 * 1、把集合转成数组
 * 2、使用集合中的迭代器
 * 3、通过List的size()和get()方法结合来遍历List集合
 */
public class Demo02 {

    public static void main(String[] args) {
        //List集合存储学生对象并遍历
        //通过List的size()和get()方法结合来遍历List集合

        List list = new ArrayList();
        list.add(new Student("apple",12));
        list.add(new Student("banana",22));
        list.add(new Student("orange",32));

        //遍历
        for (int i = 0;i < list.size();i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
