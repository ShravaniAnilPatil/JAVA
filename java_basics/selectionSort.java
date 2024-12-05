package java.java_basics;

import java.util.Arrays;
class sorting{
    public static int[] sort(int[] nums){
        int n = nums.length;
        int temp=0;
        int minIndex = -1;
        for(int i =0;i<n;i++){
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
        }
        temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
    }
return nums;
}
}
public class selectionSort {
    public static void main(String[] args) {
        int [] nums ={9,10,6,1,8,4};
         int [] result = sorting.sort(nums);
         System.out.println("The sorted array is: "+Arrays.toString(result));
    }
    
}
