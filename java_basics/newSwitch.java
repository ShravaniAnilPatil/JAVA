package java.java_basics;
public class newSwitch 
{
    public static void main(String[] args) 
    {
        String day ="Monday";
        switch(day)
        {
            case "Monday" -> System.out.println("Heyy");
            case "Tuesday" -> System.out.println("Hello"); 
        }
    }
}
//This is the new switch case in java where you do not need to put  a break in order to skip the rest cases and come out of the iteration
