// creaating thread using thread class
class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello from A");
        }
    }
}

class C extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello from C");
        }
    }
}

public class B {
    public static void main(String[] args) {
        // Create thread objects
        A t1 = new A();
        C t2 = new C();

        // Start the threads
        t1.start();
        t2.start();
    }
}
