package java.java_basics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
     
        System.out.println("Enter a number");
       
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of the no is:"+" " +(fact));
        System.out.println("My name is:"+" "+(name));

    }
}
