
// Dynamic method dispatch

class A {
    public void show(){
        System.out.println("in a show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In b show");
    }
}
class  C extends  B{
    public void show(){
        System.out.println("In c show");
    }
}
public class dynamicMethoddispatch {
    public static void main(String[] args){
        A obj = new B();  //using parent class refrence to create a child class object
        obj.show();

        obj = new A();
        obj.show();

        obj = new C();
        obj.show();
    }
    
}
