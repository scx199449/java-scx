package Set.lesson08;

import java.util.Set;
import java.util.TreeSet;

public class Demo01 {

    public static void main(String[] args) {
        //TreeSet年龄和名字的排序
        Set<Person> set = new TreeSet<Person>();
        set.add(new Person("acc",28));
        set.add(new Person("abc",27));
        set.add(new Person("aac",29));
        set.add(new Person("aac",20));
        for (Person p:set) {
            System.out.println(p);
        }
    }


}

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public int compareTo(Person other) {
        int num = this.age - other.age;

        //如果年龄一样，就根据名字排序[字符串一样，比较结果也是0]
        if (num == 0){
            num = this.name.compareTo(other.name);
        }
        return num;
    }
}