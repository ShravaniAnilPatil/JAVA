package java.java_oops;


// Custom exception in java 3
// we can create custom exceptions in java by extending the extension class nad calling the parent class methos from the child class using super keyword 

class ShravaniException extends Exception {
    public ShravaniException(String message){
        super(message);
    }
}
public class ExceptioninJava2{
    public static void main(String[] args) {
        int i =20;
        int j =0;
        try {
            if(j==0)
                throw new ShravaniException("divided by a greater number");
                //throw keyword is used to throw an exception and catch it using catch block
         } 
        catch (ShravaniException e){
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
