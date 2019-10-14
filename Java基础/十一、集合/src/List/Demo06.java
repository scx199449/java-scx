package List;

import java.util.LinkedList;

//LinkedList的使用
public class Demo06 {

    public static void main(String[] args) {
        //public void addFirst(E e)及addLast(E e)
        //public E getFirst()及getLast()
        //public E removeFirst()及public E removeLast()
        //public E get(int index);

        //1、创建对象
        LinkedList list = new LinkedList();

        //2、把元素放在第一的位置
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");

        //3、把元素放在最后的位置
        list.addLast("d");
        list.addLast("e");
        System.out.println("list :" + list);

        //4、删除第一个元素
        list.removeFirst();
        System.out.println("list :" + list);

        //5、删除最后一个元素
        list.removeLast();
        System.out.println("list :" + list);

        //6、获取第一个元素
        System.out.println(list.getFirst());

        //7、获取最后一个元素
        System.out.println(list.getLast());

        //8、获取指定位置的元素
        System.out.println(list.get(1));
    }

}
