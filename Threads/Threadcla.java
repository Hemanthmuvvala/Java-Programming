//.Write a JAVA program that creates threads by extending Thread class.First thread display 
//“Good Morning “every 1 sec, the second thread displays “Hello “every 2 seconds and the 
//third display “Welcome” every 3 seconds,(Repeat the same by implementing Runnable).
class a extends Thread {
    @Override
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

class b extends Thread {
    @Override
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

class c extends Thread {
    @Override
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

public class Threadcla {
    public static void main(String[] args) {
        a t1 = new a();
        b t2 = new b();
        c t3 = new c();
        t1.start();
        t2.start();
        t3.start();
    }
}
