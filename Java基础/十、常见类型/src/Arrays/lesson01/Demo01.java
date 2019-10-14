package Arrays.lesson01;

import java.util.Arrays;

public class Demo01 {

    public static void main(String[] args) {

        /*Arrays类概述
        针对数组进行操作的工具类。
        提供的方法都是通过类方法调用，因为构造方法被私有了
        提供了排序，查找等功能。
        查看API文档

                成员方法
        public static String toString(int[] a)
        public static void sort(int[] a)
        public static int binarySearch(int[] a,int key)*/

        //toString 把数组转为固定格式的字符串
        int[] arr1 = {28,12,38,11,10};
        System.out.println(Arrays.toString(arr1));

        //sort 排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //binarySearch 二分检索
        //如果找不到元素都用负数表示，负数数字表示这个数应该插入的位置
        int index = Arrays.binarySearch(arr1,28);
        System.out.println(index);




    }

}
