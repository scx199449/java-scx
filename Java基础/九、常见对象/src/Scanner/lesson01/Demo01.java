package Scanner.lesson01;

import java.util.Scanner;

//Scanner类
public class Demo01 {

    public static void main(String[] args) {
        /*(四)  Scanner的成员方法(举例两种)
        hasNextXX 判断是否还有下一个输入项，其中Xxx可以是Int,Double等，如果需要判断是否为字符串，则可以省略Xxx
        nextXX 获取下一个输入项，Xxx的含义和上个方法的Xxx相同*/

        //1、创建Scanner对象
        Scanner scanner = new Scanner(System.in);

       /* if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            System.out.println(x);
        }else{
            System.out.println("您输入的不是int类型");
        }*/

       if (scanner.hasNext()) {//这个方法作用不大，因为输入数字也理解成该字符串
           String str = scanner.nextLine();
           System.out.println("str:"+ str);
       }
    }
}
