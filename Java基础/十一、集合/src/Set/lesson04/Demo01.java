package Set.lesson04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import Set.Person;


//LinkedHashSet的概述和使用

/**
 * HashSet存和取的顺序是不一样
 * LinkedHashSet 存和取的顺序是一样的
 */
public class Demo01 {

    public static void main(String[] args) {
        /*
        1、LinkedHashSet是一个具有可预知迭代顺序的 Set 接口。
        2、内部实现是使用哈希表和链接列表
        3、LinkedHashSet的特点是可以保证怎么存就怎么取
        4、LinkedHashSet是set集合中唯一一个能保证怎么存就怎么取的集合对象
        5、LinkedHashSet是HashSet的子类,所以也是保证元素唯一的,与HashSet的原理一样
        */

        //HashSet集合
        //Set<Person> set1 = new HashSet<Person>();
        Set<Person> set1 = new LinkedHashSet<Person>();
        set1.add(new Person("张XX",29));
        set1.add(new Person("李XX",29));
        set1.add(new Person("黄XX",29));
        set1.add(new Person("邓XX",29));
        set1.add(new Person("习XX",29));

        //遍历
        for (Person p:set1) {
            System.out.println(p);
        }
    }

}
