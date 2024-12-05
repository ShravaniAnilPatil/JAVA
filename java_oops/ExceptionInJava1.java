//exception in java 1

public class ExceptionInJava1{
    public static void main(String[] args) {
        int i =10;
        int j =10;
        int nums[] = new int[5];
        String str = null;

        try {
            System.out.println(j/i);
            System.out.println(str.length());
            System.out.println(nums[5]);
            System.out.println("Hello Shraa");
            
        } 
        catch (ArithmeticException e) {
            //catch block wil be executed only in case of exception else will not be executed
            System.out.println("cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds");
        }
       catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
    }
    
}
