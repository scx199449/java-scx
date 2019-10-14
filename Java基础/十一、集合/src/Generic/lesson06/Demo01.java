package Generic.lesson06;

import Generic.Student;

public class Demo01 {

    public static void main(String[] args) {
        //泛型类和泛型方法

        //使用泛型类

        //1、创建对象
        Tool<String> tool = new Tool<String>();

        //2、使用方法
        tool.print("abc");

        tool.setO("java");
        System.out.println(tool.getO());

        Tool<Student> tool2 = new Tool<Student>();
        tool2.print(new Student("刘",23));
        Student stu1 = tool2.get(1);
        System.out.println("stu1:" + stu1);
    }

}

//声明一个泛型类

/**
 * 1、<>号中的名字没有要求，任何一个字母都行，最好用大写字母
 * 2、<>号的类型可以有多个，用逗号隔开，一般在工作中只声明一个
 */
class Tool<T> {
    //泛型属性
    private T o;

    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }

    //声明泛型方法
    public void print(T t){
        System.out.println(t);
    }

    //3、声明泛型方法
    public T get(int index){
        return null;
    }


}