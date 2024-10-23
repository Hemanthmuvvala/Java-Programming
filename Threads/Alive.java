class a extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class b extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class c extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Threadcla {
    public static void main(String[] args) throws Exception {
        a t1 = new a();
        b t2 = new b();
        c t3 = new c();
       
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
