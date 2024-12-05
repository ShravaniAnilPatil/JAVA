//interfaces with methods part 1 
// all variables in interfaces are final and static

interface A{
    void show();
    void fly();
}
class B implements A{
    public void show(){
        System.out.println("in b show");
    }
    public void fly(){
        System.out.println("in b fly");
    }
}


public class InterfacesInJava1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.fly();
    }



}
