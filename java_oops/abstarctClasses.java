
// Abstract class and abstract method

abstract class City{
    public abstract void show();
    public void display(){
        System.out.println("Shravani is from India");
    }
}
    class Pune extends City{
        public void show(){
            System.out.println("Shravani is in Pune");
        }
    }

public class abstarctClasses{
    public static void main(String[] args) {
        Pune p1 = new Pune();
        p1.show();
        p1.display();
    }
    
}   
