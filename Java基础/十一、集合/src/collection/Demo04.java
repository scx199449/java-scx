package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//集合的遍历之迭代器遍历
public class Demo04 {

    public static void main(String[] args) {
        //集合的遍历之迭代器遍历
        /*1、迭代器概述
                迭代器是用来遍历集合的每一个元素的
        2、查看Iterator文档，介绍接口Iterator方法
        3、迭代器有两个方法hasNext()和next()*/

       //案例一：迭代器的使用(案例)一个是字符串集合的遍历
        Collection col1 = new ArrayList();
        col1.add("苹果");
        col1.add("芒果");
        col1.add("奇异果");

        //获取迭代器【迭代器不需要new，通过方法获取】
        Iterator iterator = col1.iterator();
        //System.out.println(iterator.getClass());是java.util.ArrayList内部类

        //遍历
        while (iterator.hasNext()){ //判断是否有下一个元素
            Object o = iterator.next(); //获取下一个元素
            System.out.println(o);
        }

        //案例一:迭代器的使用(案例)一个是学生对象集合的遍历
        Collection col2 = new ArrayList();
        col2.add(new Student("Tom",23));
        col2.add(new Student("Amy",22));
        col2.add(new Student("lucy",21));

        //获取迭代器
        Iterator iterator2 = col2.iterator();
        while (iterator2.hasNext()){
            Object stu = iterator2.next();
            System.out.println(stu);
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
