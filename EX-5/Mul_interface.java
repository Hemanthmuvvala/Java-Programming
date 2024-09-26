import java.util.*;

interface One {
    void msg();
}

interface Two {
    void sent();
}

interface Three {
    void seen();
}

class four implements One, Two, Three {

    public void msg() {
        System.out.println("This is the message.");
    }

    public void sent() {
        System.out.println("The message is sent.");
    }

    public void seen() {
        System.out.println("The message is seen by us.");
    }

    public static void main(String[] args) {
        four obj = new four();
        obj.msg();
        obj.sent();
        obj.seen();
    }
}
