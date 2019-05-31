package test_class;

import java.lang.reflect.Method;

//Java反射demo4 ，通过反射机制获取类的成员方法
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        //1、获取class对象
        Class stuclass = Class.forName("entity.Student");
        //2、获取成员方法
        //获取所有的公有方法
        Method[] methods = stuclass.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println("\n");

        //获取所有的方法
        methods = stuclass.getDeclaredMethods();
        for (Method m:methods) {
            System.out.println(m);
        }
        System.out.println("\n");

        //获取公有的指定方法
        Method m = stuclass.getMethod("study");
        System.out.println(m);
        Object obj = stuclass.getConstructor().newInstance();
        m.invoke(obj);//使用invoke才能调用Method类的方法
        System.out.println("\n");

        //获取私有的指定方法
        Method m1 = stuclass.getDeclaredMethod("sleep");
        System.out.println(m1);
        m1.setAccessible(true);
        m.invoke(obj);
    }
}
