package com.zqh.algorithm.sort;

/**
 * @Description 希尔排序
 * @Author Hua
 * @Date 2021/8/5
 * @Version 1.0
 **/
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2,5,8,6,9,7,4,3,52,18};
        int length = arr.length;
        int gap = length/2;

        while (gap > 0){
            for(int i = gap;i < length;i++){
                int current = arr[i];
                int preIndex = i - gap;
                while (preIndex > 0 && current < arr[preIndex]){
                    arr[preIndex+gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex+gap] = current;
            }
            gap /=2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
