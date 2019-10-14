package Set.lesson06;

import java.util.Set;
import java.util.TreeSet;
import Set.Person;

public class Demo01 {

    public static void main(String[] args) {
        //TreeSet存储自定义对象
        /**
         * 当TreeSet中添加自定义对象时，会出现ClassCastException类型转换异常
         * 为什么？
         *     因为TreeSet在添加元素时，内部会把Person转为Comparable
         * 为什么内部要转为Comparable？
         *      Comparable是一个接口，用于指定排序规则
         * 4、当使用TreeSet自定义元素时，这个类需要实现Comparable接口
         *    并实现CompareTo方法
         *    当返回 0： 只存第一个元素
         *          -1：倒序存元素
         *          1： 怎么加就怎么存
         */
        Set<Person> set = new TreeSet<Person>();
        set.add(new Person("刘能",28));
        set.add(new Person("赵四",19));
        set.add(new Person("王五",27));
        set.add(new Person("鸭蛋",30));

        for (Person p:set) {
            System.out.println(p);
        }
    }

}
