package Object.lesson04;

import Object.lesson04.com.j1707.model.Student;

//Object类的toString 方法
public class Demo01 {

    public static void main(String[] args) {
        /*
        (一)  toString方法返回此对象的字符串表示
        (二)  包名+@+Integer.toHexString(d.hashCode())
        (三)   toString方法默认返回的字符没啥用
        (四)   打印对象，默认就是调用toString方法
        (五)   此方法一般用于自定义字符串输出
        */

        Student stu = new Student("小王","中国");
        System.out.println(stu);//当直接打印一个对象的时候，会调用object的tostring

        //@4554617c这个数字是由对象的hashcode的值转成16进制表达方式

    }
}
