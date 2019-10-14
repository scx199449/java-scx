package innerclass.lesson02;

public class Demo02 {

    public static void main(String[] args) {

    }
}

class Outer {

    int a = 12;

    class Inner {
        public void test2() {
            //1、内部类可以直接访问外部类的成员，包括私有。
            System.out.println("内部类访问外部的变量a=" + a);
        }
    }
}
