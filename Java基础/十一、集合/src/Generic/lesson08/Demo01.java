package Generic.lesson08;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        /*增强for概述:简化数组和Collection集合的遍历
        格式：
        for(元素数据类型 变量 : 数组或者Collection集合) {
            使用变量即可，该变量就是元素
        }*/

        int[] arr1 = {120,110,119};
        for (int i: arr1) {
            System.out.println(i);
        }

        //2、集合
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = 0;
        for (String str:list) {
            i++;
            System.out.println("第" + i + "个元素:" + str);
        }

    }

}
