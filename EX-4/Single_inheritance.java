import java.util.*;

public class Inherit {
    void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Inherit obj1 = new Inherit();
        obj1.display();

        Child obj2 = new Child();
        obj2.display();
    }

    public static class Child extends Inherit {
        void d() {
            System.out.println("World");
        }
    }
}
