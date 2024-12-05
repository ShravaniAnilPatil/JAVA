package java.java_basics;
public class maxvalue {
    public static void main(String[] args) {
        int[] arr = {74 , 20 , 26 , 18, 27 , 90, 97 , 81 , 81, 100};
        int maxValue = arr[0];

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = Math.max(maxValue , arr[i]);
            }

        }
        int maxv1 = maxinrange(arr, 1, 4);
        System.out.println(maxValue);
        System.out.println(maxv1);
    }
    static int  maxinrange(int[] arr ,int start ,int end){
  if (start > end){
    return 0;

  }
   int maxv = arr[start];
    for (int j = start ; j< end ; j++){
        if(arr[j]>maxv){
            maxv = arr[j];
        }

    }

return maxv;
}
}
