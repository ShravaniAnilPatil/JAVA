import java.util.Arrays;
class bubbleSorting{
    public static void sort(int[] arr){
    int  n = arr.length;
    for(int i =0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
}
public class bubbleSort {
    public static void main(String[] args) {
        int [] nums ={9,3,8,0,1,5};
        bubbleSorting.sort(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    
}
