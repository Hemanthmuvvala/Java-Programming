import java.util.*;

class Constructor {
    String name;
    int rollnum;

    Constructor() {
        System.out.println("This is a default constructor");
    }

    Constructor(String s, int a) {
        name = s;
        rollnum = a;
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("Hemanth", 93);
        System.out.println(obj2.name);
        System.out.println(obj2.rollnum);
    }
}
