package java.java_basics;
public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 18, 25, 78, 41, 10};
        int ans = min(arr);
        System.out.println("Minimum value: " + ans);
    }

    static int min(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return Integer.MAX_VALUE; 
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        
        return min; 
    }
}
