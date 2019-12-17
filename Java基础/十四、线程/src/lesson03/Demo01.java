package lesson03;

/**
 * 工作中，尽量不要再主线程中休眠
 */
public class Demo01 {
    public static void main(String[] args) {
        //线程休眠(掌握)
        /*Thread.sleep(毫秒), 控制当前线程休眠若干毫秒
        1秒= 1000毫秒
        1秒 = 1000毫秒* 1000微妙 * 1000纳秒（1000000000 ）*/

        //Test01();
        //Test02();
    }

    //子线程休眠
    public static void Test02() {

        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread()+" "+i);
                    //休眠
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        System.out.println("AAA");
    }

    //主线程休眠
    public static void Test01() {
        for (int i = 0;i<10;i++) {
            System.out.println(i);
            //休眠【暂停】
            try {
                Thread.sleep(1000);//主线程休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("AAAAA");
    }
}
