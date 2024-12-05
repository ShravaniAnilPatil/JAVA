package java.java_oops;

//try catch block
class A{
    public void show() {
        try{
            Class.forName("dem");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
public class trycatch {
    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
    }
}