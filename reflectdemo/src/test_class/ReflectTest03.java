package test_class;

import entity.Student;

import java.lang.reflect.Field;

//Java反射demo3 ，通过反射机制获取类的成员变量
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //1、获取class对象
        Class stuclass = Class.forName("entity.Student");
        //2、获取字段
        //获取所有的公有字段
        Field[] fields = stuclass.getFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        System.out.println("\n");

        //获取所有的字段
        fields = stuclass.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        System.out.println("\n");

        //获取公有字段并调用
        Field field = stuclass.getField("name");
        System.out.println(field);
        //获取一个对象
        Student student = (Student) stuclass.getConstructor().newInstance();
        field.set(student,"普莱斯");
        System.out.println(student.toString());
        System.out.println("\n");

        //获取私有字段并调用
        Field field1 = stuclass.getDeclaredField("number");
        System.out.println(field1);
        field1.setAccessible(true);//暴力反射，解除私有限制
        field1.set(student,100);
        System.out.println(student.toString());
    }


}
