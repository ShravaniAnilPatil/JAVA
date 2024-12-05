package java.java_basics;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args){
        int [][] arr = new int[][]{
            {10 , 25 , 7 , 36},
            {51 , 41 , 10 },
            {6 , 18}

        };
        int target = 18;
        int [] ans = search(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] search( int[][] arr , int target){
        for(int i =0 ; i< arr.length ; i++){
               for(int j = 0 ; j<arr[i].length ; j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
               }
            }

            return new int[]{-1, -1};

        }
    }

    

