package StringBuffer.lesson03;
//StringBuffer的删除功能
public class Demo01 {

    public static void main(String[] args) {

        /*1、public StringBuffer deleteCharAt(int index):
        删除指定位置的字符，并返回本身*/
        StringBuffer sb = new StringBuffer("Gosling,Java Father...");
        sb.deleteCharAt(1);
        System.out.println(sb);


        /*2、public StringBuffer delete(int start,int end):
        删除从指定位置开始指定位置结束的内容(不包括end本身这一位)，并返回本身*/
        sb.delete(2,6);
        System.out.println(sb);
    }

}
