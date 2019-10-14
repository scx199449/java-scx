package Generic.lesson12;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Demo01 {

    public static void main(String[] args) {
        //静态导入的概述和使用
        /*静态导入概述
        使用类(静态)方法时，可以不用写类名，直接调用方法

        格式：
        import static 包名….类名.方法名;
        可以直接导入到方法的级别

        注意事项
        方法必须是静态的,如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。
        由此可见，意义不大，所以一般不用，但是要能看懂。*/

        /**
         * Arrays类：
         * 数组工具类
         */
        int[] arr = {23,1,58};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        sort(arr);

        //遍历数组
        for (int num:arr) {
            System.out.println(num);
        }

    }

}
