package com.zqh.algorithm.sort;

/**
 * @Description 归并排序
 * - 把长度为n的输入序列分成两个长度为n/2的子序列；
 * - 对这两个子序列分别采用归并排序；
 * - 将两个排序好的子序列合并成一个最终的排序序列。
 * @Author Hua
 * @Date 2021/8/6
 * @Version 1.0
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2,5,8,6,9,7,4,3,52,18};
        sort(arr,0,arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }

    }

    public static void sort(int[] arr,int left,int right){
        if(left == right) return;
        //取中间索引位置
        int mid = left + (right - left)/2;
        //左半边排序
        sort(arr,left,mid);
        // 右半边排序
        sort(arr,mid + 1,right);
        // 合并两个排好序的子序列
        merge(arr,left,mid + 1,right);
    }

    public static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound){

        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr; //左序列索引位置
        int j = rightPtr;//有序列所以位置
        int k = 0;//临时数组索引位置

        while (i <= mid && j <= rightBound){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid)  temp[k++] = arr[i++];
        while(j <= rightBound) temp[k++] = arr[j++];

        for (int m = 0; m < temp.length; m++) {
            arr[leftPtr+m] = temp[m];
        }
    }
}
