package List;

import java.util.Enumeration;
import java.util.Vector;

//Vector
public class Demo05 {

    public static void main(String[] args) {

        /*1、方法
        public void addElement(E obj) //添加元素
        public E elementAt(int index) //获取元素
        public Enumeration elements()*/ //遍历元素

        //添加元素
        Vector vector = new Vector();
        vector.addElement("瑜伽");
        vector.addElement("搏击");
        vector.addElement("打篮球");

        //取元素
        System.out.println(vector.elementAt(2));

        //遍历vector集合
        //注意：起名时不要enum，因为是关键字
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Object obj = enumeration.nextElement();
            System.out.println(obj);
        }
    }

}
