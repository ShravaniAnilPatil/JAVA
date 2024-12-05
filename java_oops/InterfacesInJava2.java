// interfaces part 2 
interface Computers{
    void code();
}
class Laptop implements Computers{
    public void code(){
        System.out.println("coding on a laptop");
    }
}
class Desktop implements Computers{
    public void code(){
        System.out.println("coding on a desktop");
    }
}
class Developer{
    public void develop(Computers c){
        c.code();
        
    }
}
public class InterfacesInJava2 {
    public static void main(String[] args) {
        Computers c1 = new Laptop();
        Computers c2 = new Desktop();
        Developer d1 = new Developer();
        d1.develop(c1);
        d1.develop(c2);

 }
}
