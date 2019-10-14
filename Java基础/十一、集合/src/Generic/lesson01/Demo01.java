package Generic.lesson01;

import java.util.ArrayList;
import java.util.List;

//泛型

/**
 * 1、如果集合添加基本数据类型，内部会提升为包装类型
 * 2、如果在声明集合时，不添加泛型，会有安全隐患
 */
public class Demo01 {

    public static void main(String[] args) {
        //集合泛型
        /**
         * 泛型：
         * 1、泛型的作用：把类型明确的工作推前到创建对象或者调用方法的时候。
         * 2、泛型是一种参数化类型,把类型当作参数一样传递来明确集合的元素类型
         */

       /* List list = new ArrayList();

        //添加不同类型元素到集合
        list.add("Java"); //->String
        list.add(12);//->Integer

        //打印
        System.out.println(list);*/

        //声明一个泛型集合
        List<String> list = new ArrayList<String>();//代表集合只能存String类型
        list.add("Java");
        list.add("Golang");
        list.add("Python");


    }

}
