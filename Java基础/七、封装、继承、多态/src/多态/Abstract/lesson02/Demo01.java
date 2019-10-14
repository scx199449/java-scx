package 多态.Abstract.lesson02;

public class Demo01 {

    public static void main(String[] args) {
       /* 抽象类不能实例化，那么如何进行抽象类实例化？
        由具体的子类实例化。其实这也是多态的一种，抽象类多态*/

       Cat cat1 = new Cat();
       cat1.eat();

       //多态
        /**
         * 叫法:
         * 1、父类指向子类
         * 2、抽象类指向子类对象
         * 3、抽象类指向实现类对象
         */
       Animal cat2 = new Cat();
       cat2.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}