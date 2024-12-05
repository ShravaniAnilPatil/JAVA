// to demonstarte multiple inheritance using interfaces
interface  A{
    void show();
}
interface B{
    void fly();
}
class C implements A,B{
    public void show(){
        System.out.println("Show them you can do it all");
    }
    public void fly(){
        System.out.println("Fly high chase it all");
    }
}
public class multipleInheritence {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.fly();
    }
 }
   
