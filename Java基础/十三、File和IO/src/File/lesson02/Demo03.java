package File.lesson02;

import java.io.File;

public class Demo03 {

    public static void main(String[] args) {
        //File类的删除功能
        /*删除功能：
        public boolean delete():删除文件或者文件夹

        删除注意事项：
            Java中的删除不走回收站。
            要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹*/

        File file = new File("E:\\Java复习项目\\Java复习代码\\Java基础\\十三、File和IO\\File\\a\\b\\c\\d");
        boolean b = file.delete();
        System.out.println(b);
    }

}
