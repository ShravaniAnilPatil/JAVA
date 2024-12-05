package java.java_basics;

import java.util.Arrays;
class sorting{
    public static int[] sort(int[] nums) {
        int n = nums.length;
    for(int i=1;i<n;i++){
        int key=nums[i];
        int j=i-1;
        while(j>=0 && nums[j]>key){
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1]=key;
    }
   return nums;
    }
}
public class insertionSort {
    public static void main(String[] args) {
        int [] nums={9,10,6,1,8,4};
        int [] result = sorting.sort(nums);
        System.out.println(Arrays.toString(result));
        
    }
    
}
