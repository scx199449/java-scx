package Generic.lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        //泛型固定下边界 ? super E
        /*
        1、回顾? extends E （E的子类）泛型固定上边界
        ArrayList.addAll(Collection<? extends Person> c)

        2、? super E （E的父类）泛型固定下边界
        ArrayList.sort(Comparator<? super Student> c)

        3、? extends E 针对存的操作
        4、? super E 针对取的操作*/

        List<Student> list = new ArrayList<Student>();
        list.add(new Student("E",13));
        list.add(new Student("F",33));
        list.add(new Student("G",23));
        list.add(new Student("H",35));
        /*list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        });*/

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age-o1.age;
            }
        });

        for (Student stu:list){
            System.out.println(stu);
        }

    }

    public static void test01() {
        List<Person> list1 = new ArrayList<Person>();
        list1.add(new Person("A",13));
        list1.add(new Person("B",23));


        List<Person> list2 = new ArrayList<Person>();
        list2.add(new Person("C",13));
        list2.add(new Person("D",23));

        List<Student> list3 = new ArrayList<Student>();
        list3.add(new Student("E",13));
        list3.add(new Student("F",23));

        list1.addAll(list2);
        list1.addAll(list3);

        for (Person p : list1) {
            System.out.println(p);
        }
    }

}

class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
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

class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

}