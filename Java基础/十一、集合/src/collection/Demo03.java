package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03 {

    public static void main(String[] args) {
        //Collection集合的带All功能测试
        //test1();
        //test2();
        //test3();
        //test4();
    }

    //取两个集合中的交集，并存在第一个集合中
    public static void test4() {
        //4、boolean retainAll(Collection c) //取两个集合中的交集，并存在第一个集合中
        Collection col1 = new ArrayList();
        col1.add("a");
        col1.add("b");
        col1.add("d");
        System.out.println("col1:" + col1);

        Collection col2 = new ArrayList();
        col2.add("a");
        col2.add("c");
        col2.add("b");
        System.out.println("col2:" + col2);

        col1.retainAll(col2);
        System.out.println(col1);
    }

    //集合2中所有的元素是否都在集合1中
    public static void test3() {
        //3、boolean containsAll(Collection c) 集合2中所有的元素是否都在集合1中
        Collection col1 = new ArrayList();
        col1.add("a");
        col1.add("b");
        col1.add("d");
        System.out.println("col1:" + col1);

        Collection col2 = new ArrayList();
        col2.add("a");
        col2.add("c");
        System.out.println("col2:" + col2);

        System.out.println(col1.containsAll(col2));
    }

    //删除集合中所有的元素
    public static void test2() {
        //2、boolean removeAll(Collection c) 从集合1中移除集合2中的元素
        Collection col1 = new ArrayList();
        col1.add("a");
        col1.add("b");
        col1.add("d");
        System.out.println("col1:" + col1);

        Collection col2 = new ArrayList();
        col2.add("a");
        col2.add("d");
        System.out.println("col2:" + col2);

        col1.removeAll(col2);
        System.out.println(col1);
    }

    //集合的相加
    public static void test1() {
        //1、boolean addAll(Collection c)  集合的相加
        Collection col1 = new ArrayList();
        col1.add("a");
        col1.add("b");
        col1.add("d");
        System.out.println("col1:" + col1);

        Collection col2 = new ArrayList();
        col2.add("d");
        col2.add("e");
        System.out.println("col2:" + col2);

        boolean b1 = col1.addAll(col2); // 当集合1的元素改变的时候，返回true，其实这个返回值很少用
        System.out.println(b1);
        System.out.println("col1:" + col1);
    }

}
