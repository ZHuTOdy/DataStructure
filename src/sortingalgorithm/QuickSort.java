package sortingalgorithm;

import java.util.Arrays;

/**
 * 快速排序
 * 2019.5.6
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr = new int[] {3, 4, 6, 7, 2, 7, 2, 8, 0, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            //把数组中第0个数字作为标准数
            int standard = arr[start];
            //记录需要排序的下标
            int low =  start;
            int high = end;
            //循环找比标准数大和小的数
            while(low < high){
                while(low < high && standard <= arr[high]){
                    high--;
                }
                //使用右边的数字替换左边的数字
                arr[low] = arr[high];
                //如果左边的数字比标准数小
                while(low < high && standard >= arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;
            //处理所有小的数字
            quickSort(arr, start, low);
            //处理所有大的数字
            quickSort(arr, low+1, end);
        }
    }
}