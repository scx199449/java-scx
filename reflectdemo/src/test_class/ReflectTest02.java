package test_class;

import entity.Student;

import java.lang.reflect.Constructor;

//Java反射demo2 ，通过反射机制获取类的构造方法
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        //步骤1:获取字节码
        Class<?> class1 = student.getClass();
        //步骤2:获取类信息
        //获取公有构造方法
        Constructor[] constructors = class1.getConstructors();
        for (Constructor constructor:constructors) {
            System.out.println(constructor);
        }
        System.out.println("\n");
        //获取所有构造方法
        Constructor[] constructors1 = class1.getDeclaredConstructors();
        for (Constructor constructor:constructors1) {
            System.out.println(constructor);
        }
        System.out.println("\n");
        //获取公有无参构造方法
        Constructor constructor = class1.getConstructor();
        System.out.println(constructor);
        Student student1 = (Student) constructor.newInstance();
        student1.name = "555";
        System.out.println(student1.toString());
        System.out.println("\n");
        //获取私有构造方法
        Constructor constructor1 = class1.getDeclaredConstructor(int.class);//传入的参数就是私有构造方法参数的类型
        System.out.println(constructor1);
        System.out.println("\n");
        //调用私有构造方法
        constructor1.setAccessible(true);
        Student student2 = (Student) constructor1.newInstance(20);
        student2.name = "123";
        System.out.println(student2.toString());

    }
}
