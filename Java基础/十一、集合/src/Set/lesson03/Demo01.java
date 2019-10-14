package Set.lesson03;

import java.util.HashSet;
import java.util.Set;
import Set.Person;

public class Demo01 {

    public static void main(String[] args) {
        //HashSet存储自定义对象保证元素唯一性
        /**
         * 思路:需要重写hashCode()和equals()方法
         */
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("张三", 28));
        set.add(new Person("张三", 38));
        set.add(new Person("李四", 28));
        set.add(new Person("李四", 28));
        set.add(new Person("李四", 28));
        System.out.println(set);
    }

}
