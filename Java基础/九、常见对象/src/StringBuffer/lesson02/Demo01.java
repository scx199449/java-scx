package StringBuffer.lesson02;
//StringBuffer的添加功能
public class Demo01 {

    public static void main(String[] args) {
        /*三、StringBuffer的添加功能*/
        //1、public StringBuffer append(String str):
        //可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append("hello");
        System.out.println(sb.hashCode());
        System.out.println(sb2.hashCode());

        //2、public StringBuffer insert(int offset,String str):
        //在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
        sb.insert(5," world");
        System.out.println(sb);
    }

}
