import java.util.*;

class A {
    int h = 93;
}

class B extends A {
    int h = 100;

    void display() {
        System.out.println(super.h); 
        System.out.println(this.h);
        System.out.println(h);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
