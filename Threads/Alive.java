class First extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000); // Pauses for 1 second
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000); // Pauses for 1 second
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Alive  {

    public static void main(String[] args) throws  Exception {
        First f = new First();
        Second s = new Second();
        f.start(); // Start First thread
        s.start();
        System.out.println(f.isAlive()); // Start Second thread
        f.join();
        s.join();
        System.out.println("bye");
        System.out.println(s.isAlive());
        

    }
}
