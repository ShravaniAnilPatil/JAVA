package java.java_basics;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: "+ (a / b));
            default:
                System.out.println("Invalid operator");
        }
    }
}
