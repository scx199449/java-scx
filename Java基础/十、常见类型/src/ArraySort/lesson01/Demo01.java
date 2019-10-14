package ArraySort.lesson01;

//冒泡排序
public class Demo01 {

    public static void main(String[] args) {
        /**
         * 1、就是对数组进行由小到大的排序
         */
        int[] arr = {18,30,69,29,25};

        //1、比较4轮
        for (int i = 0 ;i < arr.length-1;i++) {
            System.out.println("第" + (i+1) + "轮比较");

            //2、打印出每一轮比较的对应的索引
            for (int j = 0;j < arr.length - 1 - i;j++) {
                //System.out.println(j);
                int left = j;
                int right = j + 1;
                System.out.println(left + "-" + right);

                //换位置
                if(arr[left] > arr[right]){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
        }

        //遍历
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


}
