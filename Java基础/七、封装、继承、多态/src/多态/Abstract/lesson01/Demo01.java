package 多态.Abstract.lesson01;

//抽象类的特点
public class Demo01 {

    public static void main(String[] args) {
        /*
        1、抽象类和抽象方法必须用abstract关键字修饰
                  abstract class 类名{}
                  public abstract void eat();
        2、抽象类不能实例化，那么如何进行抽象类实例化？
                  由具体的子类实例化。其实这也是多态的一种，抽象类多态
        3、抽象类不一定有抽象方法，有抽象方法的类一定是个抽象类或者是接口
        4、抽象类的子类
                  要么重写抽象类中的所有抽象方法
                  要么是抽象类
         */

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();


    }
}

//抽象类
abstract class Animal {
    //抽象方法，抽象方法不实现，也就是不要写{}
    public abstract void eat();

    public abstract void sleep();
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("吃饭,吃鱼。。。");
    }

    @Override
    public void sleep() {
        System.out.println("猫躺着睡");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("吃饭,啃骨头。。。");
    }

    @Override
    public void sleep() {
        System.out.println("狗趴着睡");
    }
}




abstract class Panda extends Animal {

}

class KongfuPanda extends Animal {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
