package Map.lesson08;

import java.util.*;

public class Demo01 {

    public static void main(String[] args) {
        //TreeMap集合键是Student值是String
        /*TreeMap是Map接口的实现类
        TreeMap与TreeSet一样，是可以排序的

        实现排序的两种方法
        1.学生类内部实现comparable接口
        2.在new TreeMap中传入匿名类comparator*/

        /**
         * TreeMap对key进行排序
         */
        //test01();

        //test02();

        test03();
    }

    //使用Comparator进行TreeMap的key排序
    public static void test03() {
        Map<Student, String> map = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按名字的字母倒序排序
                int num = o2.name.compareTo(o1.name);
                num = num == 0 ? 1 : num;
                return num;
            }
        });
        map.put(new Student("banana", 18), "guanzghou");
        map.put(new Student("cc", 18), "shenzhen");
        map.put(new Student("apple", 18), "hongkon");
        map.put(new Student("cc", 18), "hongkon");

        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

    //使用comparable进行TreeMap的key排序
    public static void test02() {
        Map<Student,String> map = new TreeMap<Student,String>();
        map.put(new Student("banana",18),"guanzghou");
        map.put(new Student("cc",18),"shenzhen");
        map.put(new Student("apple",18),"hongkon");
        map.put(new Student("cc",18),"hongkon");

        for(Map.Entry<Student,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

    public static void test01() {
        Map<String,String> map = new TreeMap<String, String>();
        map.put("zhangsan","广州");
        map.put("lisi","广西");
        map.put("wangwu","湖南");
        map.put("zhaoliu","湖北");
        map.put("xiaoqi","湖南");

        //遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}

class Student implements Comparable<Student>{
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
    public int compareTo(Student o) {
        //按name字母排序
        int num = this.name.compareTo(o.name);
        //同名的可以存储
        num = num == 0 ? 1:num;
        return num;
    }
}