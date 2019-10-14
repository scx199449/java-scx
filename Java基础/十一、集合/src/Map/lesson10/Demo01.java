package Map.lesson10;

import java.util.*;

public class Demo01 {

    public static void main(String[] args) {
        //集合嵌套之HashMap嵌套HashSet
        /*需求:
        一个学校有两个班
        一个班有多个学生
        通过HashMap与HashSet来实现数据存储*/

        //1、创建两个班（Set）
        Set<Student> javaClass = new HashSet<Student>();
        javaClass.add(new Student("Tom",28));
        javaClass.add(new Student("Tony",18));

        Set<Student> h5Class = new HashSet<Student>();
        h5Class.add(new Student("Jeny",28));
        h5Class.add(new Student("linda",18));

        //创建一个学校（map）
        //key:班级名字，value：这个班所有的学生
        Map<String,Set<Student>> school = new HashMap<String, Set<Student>>();
        school.put("Java班级",javaClass);
        school.put("h5班级",h5Class);

        //3、遍历
        //3.1 遍历学校里的班级
        for (Map.Entry<String,Set<Student>> entry : school.entrySet()) {
            System.out.println("班级名称："+entry.getKey());

            //3.2 遍历班级里的学生
            for (Student stu: entry.getValue()) {
                System.out.println(stu);
            }
        }
    }

}

class Student {
    String name;
    int age;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}