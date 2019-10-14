package Object.lesson03;

/**
 * Class 这类描述类的结构
 * Class 描述一个类的类名、属性、方法、构造方法
 */
public class Demo01 {

    public static void main(String[] args) {
        //Object的getClass方法
          /*
        (一)  public final Class getClass()
        (二)  返回此object运行时类
        (三)  可以通过class类中的一个方法，获取对象的真实类的全名称
        */

        Animal dog = new Dog();
        //返回此对象运行时类
        Class clz = dog.getClass();
        System.out.println(clz);
        System.out.println(clz.getSimpleName());//类名
        System.out.println(clz.getName());//包名+类名

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("鱼...");
            }
        };
        System.out.println(cat.getClass());

        AInterface ai = new AInterface() {
            @Override
            public void test1() {
                System.out.println("...");
            }
        };
        System.out.println(ai.getClass());

    }
}

interface AInterface {
    public void test1();
}


abstract class Animal {
    public abstract void eat();

}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("骨头...");
    }
}
