package innerclass.lesson04;

//接口的匿名内部类

/**
 * 匿名内部类在工作中使用的情况
 * 1、一般很少自己声明匿名内部类
 * 2、用的比较多的是线程匿名内部类
 */
public class Demo02 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.jumpFireCircle();

        /**
         * 这是一个匿名内部类，也是一个匿名对象
         */
        /*new Animals(){
            @Override
            public void jumpFireCircle() {
                System.out.println("猫跳一米高。。。");
            }
        }.jumpFireCircle();*/

        Animals cat = new Animals() {
            @Override
            public void jumpFireCircle() {
                System.out.println("猫跳一米高。。。");

            }

            @Override
            public void drink() {
                System.out.println("喝水");
            }
        };
        cat.jumpFireCircle();


    }
}

interface Animals {
    //跳火圈
    public void jumpFireCircle();

    public void drink();
}

/**
 * 如何使用接口
 * 1、写一个类实现接口
 * 2、创建一个接口的匿名内部类
 */

class Fish implements Animals {

    @Override
    public void jumpFireCircle() {
        System.out.println("鱼跳3米");
    }

    @Override
    public void drink() {

    }
}