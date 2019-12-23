package lesson03;

public class Demo02 {
    public static void main(String[] args) {
        //倒计时60秒

        //1.创建时间
        //int seconds = 60;

        //2.开始倒计时
        new Thread(new Runnable(){

            @Override
            public void run() {
                int seconds = 60;
                for(int i=0;i<60;i++){
                    System.out.println("剩余"+seconds+"秒");
                    //局部内部内可以访问局部变量，但是这个局部变量声明必须为final
                    //局部内部类不能修改
                    seconds--;

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
