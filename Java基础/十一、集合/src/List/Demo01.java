package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//List集合的特有功能概述和测试
public class Demo01 {

    public static void main(String[] args) {
        //List集合的特有功能概述
        //1、void add(int index,E element) 指定的位置插入元素
        List list = new ArrayList();
        list.add("Java");
        list.add("PHP");
        list.add("Go");
        list.add("Python");

        System.out.println("list :" + list);
        list.add(1,"H5");
        System.out.println("list :" + list);

        //2、E remove(int index) 删除指定索引的元素
        list.remove(1);
        System.out.println("list :" + list);

        //3、E get(int index) 获取指定索引的元素
        Object o = list.get(2);
        System.out.println("list.get(2) :" + o);

        //4、E set(int index,E element) 替换指定索引的元素
        list.set(1,"C++");
        System.out.println("list :" + list);

    }

}
