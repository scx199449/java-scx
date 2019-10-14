package System.lesson01;

public class Demo03 {
    public static void main(String[] args) {
        //3、public static long currentTimeMillis() 从1970年1月1日到现在走过的时间
        // 返回当前时间（以毫秒为单位）。
        long time = System.currentTimeMillis();
        System.out.printf("time is :%d",time);
    }
}
