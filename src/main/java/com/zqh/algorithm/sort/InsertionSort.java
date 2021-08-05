package com.zqh.algorithm.sort;

/**
 * @Description 插入排序
 * 样本小且基本有序的时候效率高
 * @Author
 * @Date 2021/8/5
 * @Version 1.0
 **/
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {2,5,8,6,9,7,4,3,52,18};

        for (int i = 1; i < arr.length; i++) {
            //
            int current = arr[i];
            int preIndex = i -1 ;
            while(preIndex >= 0 && current < arr[preIndex]){
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
