package java.java_basics;
public class type {
    public static void main(String[] args) {
       
       
        int a = 257 ;
        byte b=(byte)a;
        float f= 5.6f;
        int t=(int)f;
        System.out.println(b); //explicit conversions are taking palec from float to int and int to byte
        System.out.println(t);
        // this is inclusive typecasting as the range of int is greater than that of byte 
    byte num1=10;
    byte num2=20;
    int result= num1*num2; //type conversion of result from byte to int as 300 goes out of byte range
    System.out.println(result);
    }
}
