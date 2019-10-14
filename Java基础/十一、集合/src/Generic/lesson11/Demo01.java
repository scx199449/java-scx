package Generic.lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static collection.Demo03.test3;

public class Demo01 {

    public static void main(String[] args) {
//        三种迭代能否删除
        /**
         * 迭代=遍历
         */
//      1、普通for循环,可以删除,但是索引要(--减减 )
        //test1();

//      2、迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常
        //test2();

//      3、增强for循环不能删除
        test03();

    }

    public static void test03() {
        //增强for循环不能删除,增强for循环实现的内部机制就是迭代器，
        // 不允许一边遍历一边修改list，会报并发修改异常ConcurrentModificationException
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("mysql");
        list.add("h5");
        list.add("h5");
        list.add("css");

        //迭代
        for (String str:list) {
            if(str.equals("h5")){
                list.remove(str);//错误
            }
        }


    }

    public static void test2() {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("mysql");
        list.add("h5");
        list.add("h5");
        list.add("css");

        //迭代
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("h5")){
                //list.remove("h5");
                iterator.remove();//移除当前遍历的元素
            }
        }
        System.out.println("list :" + list);
    }

    private static void test1() {
        //普通for循环,可以删除,但是索引要(--减减 )
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("mysql");
        list.add("h5");
        list.add("h5");
        list.add("css");

        //遍历
        for (int i = 0;i < list.size();i++){
            //取出元素
            String str = list.get(i);
            if (str.equals("h5")){
                list.remove("h5");
                i--;
            }
        }

        System.out.println("list :" + list);
    }

}
