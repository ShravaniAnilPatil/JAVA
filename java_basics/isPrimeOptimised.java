package java.java_basics;
import java.util.Scanner;

public class isPrimeOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        
        // Edge cases
        if (num <= 1) {
            System.out.println("not prime");
            return;
        }
        
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
