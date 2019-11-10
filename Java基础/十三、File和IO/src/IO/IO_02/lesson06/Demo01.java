package IO.IO_02.lesson06;

public class Demo01 {

    public static void main(String[] args) {
         //设计模式
        /**
         * 一、设计模式【一种固定代码风格】
         *          面试题：Java中有哪些设计模式：
         *          常用设计模式：装饰模式、单例模式、模板模式、适配器模式、代理模式、工厂模式。。。
         *
         * 二、装饰(Decorator)设计模式
         *  装饰模式的概念:
         * 1、动态的给一个对象添加一些额外的功能，就增加功能来说，装饰模式比生成子类更为灵活。
         * 2、在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。
         * 3、它是创建一个包装对象，也就是使用装饰来包裹真实的对象。
         *
         *  装饰模式的实现方式
         * 1. 装饰对象和真实对象有相同的接口/抽象类。
         * 2. 装饰对象包含一个真实对象的引用（reference）
         * 3. 装饰对象的所有方法，内部实现都是通过真实对象的引用来调用，然后实现自己的功能
         *
         *
         * 适用性
         * 1. 需要扩展一个类的功能，或给一个类添加附加职责。
         * 2. 当不能采用生成子类来实现，比如final类
         */

        /*GYFStudent stu = new GYFStudent();
        stu.code();*/

        GYFStudent stu = new GYFStudent(new UniversityStudent());
        stu.code();
    }

}

//1.接口
interface Person {
    public void code();
}

//2.接口的实现类
final class UniversityStudent implements Person {

    @Override
    public void code() {
        System.out.println("在大学期间学了一点C语言...");
    }
}

/*class GYFStudent extends UniversityStudent {
    @Override
    public void code() {
        super.code();
        System.out.println("在这里学习了Java");
    }
}*/

class GYFStudent implements Person {

    private UniversityStudent us;

    public GYFStudent(UniversityStudent us){
        this.us = us;
    }

    //装饰对象的所有方法，内部实现都是通过真实对象的引用来调用，然后实现自己的功能
    @Override
    public void code() {
        us.code();
        System.out.println("在这里学习了Java");
    }
}


