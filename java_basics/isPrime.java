package java.java_basics;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int count=0;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number:");
       int num = sc.nextInt();
       sc.close();
       for(int i=1;i<num;i++){
        if(num%i==0){
            count++;
        }
       }
       if(count>2){
        System.out.println("not prime");
       }
       else{
        System.out.println("prime");
       }
    }
}
