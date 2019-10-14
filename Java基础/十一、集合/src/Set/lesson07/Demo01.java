package Set.lesson07;

import Set.Person;

import java.util.Set;
import java.util.TreeSet;

public class Demo01 {

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<Person>();
        set.add(new Person("刘能",28));
        set.add(new Person("刘能",28));
        /*set.add(new Person("王五",27));
        set.add(new Person("鸭蛋",30));*/

        for (Person p:set) {
            System.out.println(p);
        }
    }

}
