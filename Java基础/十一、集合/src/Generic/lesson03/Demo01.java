package Generic.lesson03;

import Generic.Person;
import Generic.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        //泛型注意事项
        //1、默认声明一个泛型集合，前后类型要一至
          List<Student> list1 = new ArrayList<Student>();

        //2、这样声明前后类型不一至是不可以的
          //List<Object> list2 = new ArrayList<Person>();

        //3、集合泛型的声明，可以只声明前面的泛型,jdk1.7的新特性:菱形泛型,开发时建议还是写成前后一至
          List<Student> list3 = new ArrayList<>();

        //4、集合声明的泛型，代表此类或者子类都可以成为集合的元素，eg: Person -> Person
        List<Person> list4 = new ArrayList<Person>();
        list4.add(new Person());
        list4.add(new Student());

        //5、声明的泛型类型一定是引用数据类型（类）
        //Lit<int> list6 = new ArrayList<int>();//错误写法
        List<Integer> list6 = new ArrayList<Integer>();
    }

}
