package com.zqh.algorithm.sort;

/**
 * @Description 快速排序
 * @Author Hua
 * @Date 2021/8/8
 * @Version 1.0
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,0};
        QuickSort2(arr,0,arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }

    }

    /**
     * 左右指针法
     * @param arr
     * @param left
     * @param right
     */
    public static void QuickSort1(int[] arr,int left,int right){
        if(left > right) return;
        int pos = partition1(arr, left, right);
        QuickSort1(arr,left,pos - 1);
        QuickSort1(arr,pos + 1,right);
    }

    /**
     * 挖坑法
     * @param arr
     * @param left
     * @param right
     */
    public static void QuickSort2(int[] arr,int left,int right){
        if(left > right) return;
        int pos = partition2(arr, left, right);
        QuickSort2(arr,left,pos - 1);
        QuickSort2(arr,pos + 1,right);
    }

    /**
     * 左右指针法分区方法
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition1(int[] arr,int left,int right){

        int begin = left;
        int end = right;
        int key = right;

        while (begin < end ){
            //begin找大
            while (begin < end && arr[begin] <= arr[key]){
                begin++;
            }
            //end找小
            while (begin < end && arr[end] > arr[key]){
                end--;
            }
            swap(arr,begin,end);
        }
        swap(arr,begin,right);
        return begin;

    }

    /**
     * 挖坑法分区方法
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition2(int[] arr,int left,int right){

        //初始坑
        int key = arr[right];
        while (left < right){
            while (left < right && arr[left] <= key){
                left++;
            }
            arr[right] = arr[left];
            while (left < right && arr[right] >= key ){
                right--;
            }
            arr[left] = arr[right];
        }
        arr[left] = key;

        return left;
    }

    public static int[] swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
