package Generic.lesson07;

import Generic.Person;
import Generic.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
//      泛型通配符<?>,一般在声明变量类型时使用
//      任意类型，如果没有明确，那么就是Object以及任意的Java类了
        List<Object> list = new ArrayList<Object>();
        //List<?> list = new ArrayList<?>();//声明时右边不能用？号
        list.add(1);
        list.add(9.8);
        list.add(new Student("小李",10));

        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        print(list2);


//      ? extends E
//      向下限定，E及其子类
        List<Person> list1 = new ArrayList<Person>();
        list1.add(new Person());
        list1.add(new Person());
        list1.add(new Person());

        List<Person> list4 = new ArrayList<Person>();
        list4.add(new Person());
        list4.addAll(list4);
        System.out.println(list4);
//
//      ? super E
//      向上限定，E及其父类

    }

    public static void print(List<?> list){
        System.out.println(list);
    }

}
