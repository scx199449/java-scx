package test_class;

import entity.Student;

//Java反射demo1， 获取字节码的三种方式
public class ReflectTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        //方法一
        Class<?> class1 = student.getClass();
        //方法二
        Class<?> class2 = Student.class;
        //方法三
        Class class3 = null;
        try {
            class3 = Class.forName("entity.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(class1 + " " + class2 + " " + class3);
    }
}
