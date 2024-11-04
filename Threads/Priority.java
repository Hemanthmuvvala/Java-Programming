class A implements Runnable {
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

class B implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Hello");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class C implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Welcome");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);

        // Setting thread priorities
        t1.setPriority(Thread.MAX_PRIORITY); // Highest priority
        t2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        t3.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
