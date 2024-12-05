
//this and super keyword
class A {
    public A(){
        System.out.println("in A ");
    }
}
class  B extends  A{
 public B (int n ){
    System.out.println("with int B");
 }

    public  B(){
    // super();
    this(8);
    System.out.println("in B ");
}
}

public class thisAndSuper {
    public static void main(String[] args) {
        B b1 = new B();
        
    }
    
}
