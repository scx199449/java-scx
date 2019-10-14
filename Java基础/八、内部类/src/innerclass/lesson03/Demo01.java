package innerclass.lesson03;

//局部内部类
public class Demo01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test1();
    }
}

/**
 * 局部内部类在访问他所在方法中的局部变量必须用final修饰,为什么?
 *  因为当调用这个方法时,局部变量如果没有用final修饰,他的生命周期和方法的生命周期是一样的,
 *  当方法弹栈,这个局部变量也会消失,那么如果局部内部类对象还没有马上消失，想用这个局部变量,就没有了,
 *  如果用final修饰会在类加载的时候进入常量池,即使方法弹栈,常量池的常量还在,也可以继续使用
 *
 * jdk1.8,不加final代码不会报错，jdk1.7以下版本不写final会报错
 */
class Outer{
    public void test1(){
        int a = 10;//局部变量

        class Inner{//局部内部类
            public void test2(){
                System.out.println(a);//如果是1.7的话，会报错
            }
        }
        Inner inner = new Inner();
        inner.test2();
    }
}

