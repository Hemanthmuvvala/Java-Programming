class A implements Runnable{
    public void run() {
        System.out.println("Good morning");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class B implements Runnable{
    public void run() {
        System.out.println("Hello");
        while(true){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
}
class C implements Runnable{
    public void run() {
        System.out.println("Welcome");
        while(true){
        try {
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
