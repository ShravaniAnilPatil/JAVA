// inheritence

class girl{
    
    public void show(){
        System.out.println("hello");
    }
}
 class women extends  girl{
    public void say(){
        System.out.println("hi");
    }
}
public class Inheritence{
    public static void main(String[] args) {
        women w = new women();
        w.show();
        w.say();
    }
}
    

