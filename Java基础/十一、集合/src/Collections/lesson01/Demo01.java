package Collections.lesson01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        //Collections工具类的概述和常见方法讲解
        /**
         * 1.Collection 与 Collections区别
         * Collection是一个接口
         * Collections是一个类
         *
         * 2、Collections的作用：针对集合操作的工具类
         * 3、Collections成员方法
         *   public static <T> void sort(List<T> list)
         *   public static <T> int binarySearch(List<?> list,T key)
         *   public static <T> T max(Collection<?> coll)
         *   public static void reverse(List<?> list)
         *   public static void shuffle(List<?> list)
         */

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(23);
        list1.add(2);
        list1.add(3);
        list1.add(13);
        System.out.println(list1);

        //给list集合进行排序
        /*Collections.sort(list1);
        System.out.println(list1);*/

        //二分查找
        int index = Collections.binarySearch(list1,23);
        System.out.println(index);

        //取最大值
        int max = Collections.max(list1);
        System.out.println(max);

        //反转
        Collections.reverse(list1);
        System.out.println(list1);

        //打乱
        Collections.shuffle(list1);
        System.out.println(list1);

    }

}
