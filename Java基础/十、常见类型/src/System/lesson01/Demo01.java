package System.lesson01;
//System类
public class Demo01 {
    public static void main(String[] args) {
        /*成员方法*/
        //1、public static void gc()  运行垃圾回收器。
        for (int i=0;i<10;i++){
            //new 一支香烟
            new Cigarette();
            System.gc();//只要你创建一个对象，我就回收一个对象
        }

        //2、public static void exit(int status) 终止当前运行的Java虚拟机

        //3、public static long currentTimeMillis() 返回当前时间（以毫秒为单位）。


        //4、pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        //将指定源数组中的数组从指定位置复制到目标数组的指定位置。
    }
}


//Cigarette :香烟
class Cigarette {

    //finalize:当对象从内存消失时会调用
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "对象从内存消失了");
    }
}
