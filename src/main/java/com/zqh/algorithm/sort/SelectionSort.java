package com.zqh.algorithm.sort;

/**
 * @Description 选择排序
 * @Author Hua
 * @Date 2021/8/4
 * @Version 1.0
 **/
public class SelectionSort {
/*
1，找到数组中最小的那个元素，
2，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
3，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
4，如此往复，直到将整个数组排序。这种方法我们称之为选择排序

时间复杂度：O(n^2)    空间复杂度：O(1)   非稳定性
 */
    public static void main(String[] args) {

        int[] arr = {100,53,5,2,7,3,9,4,6,8,1};

        for (int i = 0; i < arr.length -1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {

                if(arr[minPos] > arr[j] ){
                    minPos = j;
                }
            }
            //交换
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
