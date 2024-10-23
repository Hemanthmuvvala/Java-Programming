class A implements Runnable{
    public void run() {
       
        while (true) {
            try {
                System.out.println("Good morning");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class B implements Runnable{
    public void run() {
       
        while(true){
        try {
            System.out.println("Hello");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
}
class C implements Runnable{
    public void run() {
      
        while(true){
        try {
            System.out.println("Welcome");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
}
public class Run {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3=new Thread(c);
        t1.start();
        t2.start();
        t3.start();

    }
}
