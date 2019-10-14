package List;

import java.util.LinkedList;

/**
 * 出栈时会把栈的元素返回给你，也就是说pop方法有返回值
 * 出栈时如果没有元素了，调用出栈的方法会报错NoSuchElementException(没有元素异常)
 */
public class Demo08 {

    public static void main(String[] args) {
        /*用LinkedList模拟栈数据结构【笔试题】
        需求：请用LinkedList模拟栈数据结构的集合，并测试
        创建一个类将Linked中的方法封装*/

        //LinkedList其实已经提供了栈的功能

        //1、创建栈的对象
        LinkedList stack = new LinkedList();

        //2、进栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println("栈:" + stack);

        //3、出栈
        Object obj = stack.pop();
        System.out.println("出栈元素:" + obj);
        System.out.println("栈:" + stack);

        obj = stack.pop();
        System.out.println("出栈元素:" + obj);
        System.out.println("栈:" + stack);

    }

}
