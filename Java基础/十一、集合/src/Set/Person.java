package Set;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

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

    @Override
    public int compareTo(Person o) {
        //1、先根据年龄排序
        int num = this.age - o.age;

        //TreeSet 去除重复元素，以前写的hashcode和equals方法已经不起作用了


        //如果年龄一样，也希望这个Person存到TreeSet中
        if (num == 0) num = 1;

        return num;
    }

    


   /* @Override
    public int hashCode() {
        System.out.println(this.name + ":" + this.name.hashCode());
        *//**
         * 优化：
         * 1、如果名字不一样就不要调用equals方法，从而优化代码
         *  return this.name.hashCode();
         * 2.hashCode(): 属性相同的对象返回值必须相同, 属性不同的返回值尽量不同(提高效率)
         *//*
        return this.name.hashCode() + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("...");
        Person other = (Person) obj;
        return this.age == other.age && this.name.equals(((Person) obj).name);
    }*/
}
