package java.java_oops;
//exception in java 2
public class demo10{
    public static void main(String[] args) {
        int i =20;
        int j =0;
        try {
            if(j==0)
                throw new ArithmeticException("divided by a greater number");
                //throw keyword is used to throw an exception and catch it using catch block
            
         } 
        catch (ArithmeticException e){
            j=18/i;
            //catch block wil be executed only in case of exception else will not be executed
            System.out.println("cannot divide by zero" + e);
        }
        catch(Exception e){
        System.out.println("Something went wrong");
        }
        System.out.println(j);
    }
    
}
