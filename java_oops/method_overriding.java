package java.java_oops;
//import java.util.*;

class Mythread1 extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("mythread"+" " + i);
        }
    }

}
class Mythread2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=9;i+=2){
            System.out.println("my thread"+i);
        }
    }
}
public class method_overriding{
    public static void main(String[] args) {
        Mythread1 thread1 = new Mythread1();
        Mythread2 thread2 = new Mythread2();
        thread1.start();
        thread2.start();

    }
}