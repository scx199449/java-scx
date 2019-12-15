package lesson02;

public class Demo04 {

    public static void main(String[] args) {
        /*获取线程名字和设置名字(掌握)
        1.通过Thread的getName()方法获取线程对象的名字
        2.通过setName(String)方法可以设置线程对象的名字
        3.通过构造函数可以传入String类型的名字
        4.每个线程系统都会默认分配个名字
        */

        //1.获取主线程对象
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        //2.设置线程名称
        mainThread.setName("主线程");
        System.out.println(mainThread);

        //3.设置子线程的名称
        MyNewThread myNewThread = new MyNewThread("子线程");
        myNewThread.start();

    }

}

class MyNewThread extends Thread {

    public MyNewThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("银行代发工资业务..."+Thread.currentThread());
    }
}