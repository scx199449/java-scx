package 多态.polymorphic.lesson01;

//多态
/*二、多态中的成员访问特点 */
public class Demo01 {
    public static void main(String[] args) {
        //1、成员变量：编译看左边(父类)，运行看左边(父类)
        //编译时会看左边的Father类中是否有num属性，没有就会报错
        //运行也是看左边是获取的Father类中的num属性
        Father son1 = new Son();
        System.out.println(son1.num);

        //2、成员方法：编译看左边(父类) ，运行看右边(子类)
        //编译时会看左边的Father类中是否有eat()成员方法，没有就会报错
        //运行也则看右边是调用的Son类中的eat()成员方法，如果Son类中没有，则会调用Father类的成员方法
        Father son = new Son();
        son.eat();

        //3、静态方法：编译看左边(父类) ，运行看左边(父类)
        //编译时会看左边的Father类中是否有look()静态方法，没有就会报错
        //运行也会看左边调用的Father类中的look()静态方法
        //通过对象调用静态方法，不要这样用，因为实际内部也会转为类名调用静态方法
        /*Father son2 = new Son();
        son2.look();*/
        Father.look();//正确写法

        //总结:只有非静态的成员方法，编译看左边，运行看右边
    }

}


class Father {
    int num = 10;

    public void eat() {
        System.out.println("吃海鲜。。。");
    }

    public static void look() {
        System.out.println("看电影。。。");
    }
}

class Son extends Father {
    int num = 20;

    public void eat() {
        System.out.println("吃野味。。。");
    }

    public static void look() {
        System.out.println("看动漫。。。");
    }

}