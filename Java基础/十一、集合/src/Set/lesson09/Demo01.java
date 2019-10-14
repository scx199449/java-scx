package Set.lesson09;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo01 {

    public static void main(String[] args) {

        Set<Student> stus = new TreeSet<Student>();
        stus.add(new Student("bb",18));
        stus.add(new Student("bbb",28));
        stus.add(new Student("a",58));
        stus.add(new Student("ccc",88));

        for (Student stu:stus) {
            System.out.println(stu);
        }
    }

}

class Student implements Comparable<Student>{
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //1、按照姓名长度
        int num = this.name.length() - o.name.length();

        //2、字母排序【由小到大】
        if (num == 0){
            num = this.name.compareTo(o.name);
        }

        //3、年龄排序
        if (num == 0){
            num = this.age - o.age;
        }

        return num;
    }
}
