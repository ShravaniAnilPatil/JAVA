package java.java_oops;
class add{
    public int add(int a,int b,int c){
        System.out.println(a+b+c);
        return 1;
    }
    public int add(int d,int e){
        System.out.println(d+e);
        return 0;
    }
  
}
class addo extends add{
    public int add(int f){
        System.out.println(f);
        return 2;
    }
  
}
public class method {
    public static void main(String[] args) {
        add a1 = new add(); //{*here, only new add is creating an object , a1 is just a refrence variable}
        add a2 = new add();
        addo a3= new addo();
        a1.add(4,5,6);
        a2.add(10,10);
        a3.add(50);
    }
}
