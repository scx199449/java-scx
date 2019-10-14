package Generic.lesson05;

import Generic.Student;

import java.util.Date;

/**
 * 泛型的由来：解决类型转换异常的问题
 */
public class Demo01 {

    public static void main(String[] args) {
        /*泛型的由来:
        1、早期的Object类型可以接收任意的对象类型
        2、但是在实际的使用中，会有类型转换的问题。也就存在这隐患
        3、所以Java提供了泛型来解决这个安全问题。*/

        Object obj1= "Java";
        Object obj2 = new Student();
        Object obj3 = new Date();

        String s1 = (String) obj3;//错误写法
    }

}
