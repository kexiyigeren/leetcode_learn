package com.zqh.algorithm.sort;

/**
 * @Description 冒泡排序
 * @Author Hua
 * @Date 2021/8/5
 * @Version 1.0
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,8,6,9,7,4,3,52,18};

        for (int k = arr.length; k > 0; k--) {
            for (int i = 0; i < k - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
