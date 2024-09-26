import java.util.*;

interface One {
    void msg();
    void deliver();
}

class InterfaceDemo implements One {
    public void msg() {
        System.out.println("Hemanth is a good boy");
    }

    public void deliver() {
        System.out.println("The message is delivered");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.msg();
        obj.deliver();
    }
}
