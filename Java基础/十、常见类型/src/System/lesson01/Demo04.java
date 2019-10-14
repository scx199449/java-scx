package System.lesson01;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        //4、pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        //将指定源数组中的数组从指定位置复制到目标数组的指定位置。数组拷贝
        /**
         * Object src 源对象
         * int srcPos 源对象位置
         * Object dest 目标对象
         * int destPos 目标位置
         * int length 长度
         */

        int[] arr1 = {23,21,2,18,49};
        int[] arr2 = new int[3];

        System.arraycopy(arr1,1,arr2,0,3);
        System.out.println(Arrays.toString(arr2));

    }
}
