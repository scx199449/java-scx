package 多态.polymorphic.lesson02;

/*三、多态中向上转型和向下转型*/
public class Demo01 {

    public static void main(String[] args) {
        //向上转型：父类指向子类对象 Person p = new SuperMan();
        Person p = new SuperMan();

        //向下转型：子类指向父类对象 SuperMan sm = (SuperMan)p;
        //向下转型注意: 父类的真实对象必须是子类对象,否则会有问题
        SuperMan superMan = (SuperMan)p;
    }
}

//普通人
class Person {
    public void walk() {
        System.out.println("走。。。");
    }

    public void fly() {
        System.out.println("我是普通人，不会飞。。。");
    }
}


//超人
class SuperMan extends Person {
    public void fly() {
        System.out.println("超人飞去救人。。。");
    }
}