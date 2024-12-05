package java.java_basics;
class getnum{
    public static int binary(int [] nums , int target){
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
}
}

public class BinarySearch{
public static void main(String[] args) {

    int [] nums = {1,2,3,4,5,6,7,8,9,10};
    int target = 6;
    int ans = getnum.binary(nums , target);
    System.out.println(ans);
    
}
}