// this is used to implement thread using runnable interface
class A implements Runnable {
    @Override
    public void run() {
       
            System.out.println("Hello from A"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
        
    }
}

class C implements Runnable {
    @Override
    public void run() {
        
            System.out.println("Hello from C"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
        
    }
}

public class Rt {
    public static void main(String[] args) {
        // Create thread objects
        A a = new A();
        C c = new C();
        Thread t1=new Thread(a," java");
        Thread t2=new Thread(c," program");


        // Start the threads
        t1.start();
        t2.start();
    }
}
