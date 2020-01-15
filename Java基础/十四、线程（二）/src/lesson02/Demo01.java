package lesson02;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /*Runtime类是一个单例类
        每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
        可以通过 getRuntime 方法获取当前运行时。
        案例:自动关机
        Runtime r = Runtime.getRuntime();
        r.exec("shutdown -s -t 300");//300秒后关机
        r.exec("shutdown -a"); //取消关机 */

        Runtime r = Runtime.getRuntime();
        //r.exec("shutdown -s -t 300");//300秒后关机
        r.exec("shutdown -a"); //取消关机
    }
}
