package 多态.Abstract.lesson03;
//抽象类成员的特点
public class Demo01 {

    public static void main(String[] args) {
       /*
        1、成员变量:即可以是变量，也可以是常量。
        2、abstract不能修饰成员变量，只能修饰类和方法
        3、构造方法:抽象类也是有构造方法的，用于子类访问父类数据的初始化
        4、成员方法:抽象类的方法可以是抽象的，也可以是非抽象

        5、抽象类的成员方法特性:
        抽象方法：强制要求子类实现
        非抽象方法：子类继承实现自己的业务，提高代码的复用性
        */

       //写多态
        Animal cat = new Cat();
        cat.name = "小花";
        cat.say();

    }
}

abstract class Animal {
    String name;
    final int MAX_LEGS = 4;//动物最多有多少条腿
    public Animal(){

    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public abstract void eat();
    public void say() {
        System.out.println("123");
    }
}

class Cat extends Animal {

    public Cat() {
        super("小黑");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我很漂亮");
    }
}