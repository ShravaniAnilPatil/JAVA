package java.java_basics;

//implementing quick sort in java 

import java.util.Arrays;

public class QuickSort {
    public static void QuickSort(int [] nums , int low , int high){
        if(low<high){
            int pi= partition(nums, low, high);
            QuickSort(nums, low, pi-1);
            QuickSort(nums, pi+1, high);

        }
    }
    public static int partition(int [] nums , int low , int high){
        int high1 = nums.length -1;
        int low1 =0;
        int pivot = nums[high];
        int i = low1-1;
        for(int j=low1;j<high1;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums, i, j);
        }
        swap(nums , i+1 , high);
    }
    return i+1;   
}
    public static void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int [] nums = {9,10,6,1,8,4};
        QuickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
