package innerclass.lesson04;
//匿名内部类
public class Demo01 {

    public static void main(String[] args) {
        //匿名内部类的格式和理解
        /**
         * (一)  匿名内部类就是内部类的简化写法
         * (二)  写匿名内部类前提是存在一个抽象类或者接口
         * (三)  匿名内部类格式：
         *         new 抽象类或者接口名(){ 重写方法; }
         * (四)  匿名内部类本质是什么呢?
         *         是一个继承了该类或者实现了该接口的子类匿名对象
         * (五)  匿名内部类的特点
         *         匿名内部类必须实现接口的所有方法
         *         匿名内部类必须实现抽象类的所有方法
         * (六)  匿名内部类的方法调用
         *         像普通对象一样，调用方法即可
         */

         Dog dog = new Dog();
         dog.eat();

         //抽象类的匿名内部类
         //匿名内部类，就是实现抽象类的子类没有类名
         Animal cat = new Animal(){
             @Override
             public void eat() {
                 System.out.println("吃鱼...");
             }

             @Override
             public void sleep() {
                 System.out.println("猫趴着睡...");
             }
         };

         cat.eat();
         cat.sleep();


    }
}

abstract class Animal {
    public abstract void eat();

    public abstract void sleep();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("啃骨头.....");
    }

    @Override
    public void sleep() {

    }


}