package List;

import java.util.LinkedList;

public class Demo07 {

    public static void main(String[] args) {
        /*用LinkedList模拟栈数据结构【笔试题】
        需求：请用LinkedList模拟栈数据结构的集合，并测试
        创建一个类将Linked中的方法封装*/

        /**
         * 分析：
         * 1、栈(stack)的特点：先进后出
         * 2、进栈、出栈两个操作
         *
         * 写代码：栈（用一个类表示）
         *         类提供两个方法
         */

        //创建一个栈对象
        Stack stack = new Stack();

        //进栈
        stack.in("a");
        stack.in("b");
        stack.in("c");
        stack.in("d");

        //打印下栈的数据
        System.out.println("stack :" + stack.list);

        //出栈
        Object obj = stack.out();
        System.out.println("出栈的元素是:" + obj);
        System.out.println("stack :" + stack.list);

        obj = stack.out();
        System.out.println("出栈的元素是:" + obj);
        System.out.println("stack :" + stack.list);
    }

}

class Stack{
    //创建一个集合
    LinkedList list = new LinkedList();

    //进栈
    public void in(Object obj){
        //把元素添加到集合
        list.addFirst(obj); //集合前面的是栈顶，后面的是栈底
    }

    //出栈
    public Object out(){
      return list.removeFirst();//返回移除的元素
    }
}
