class Multi {
    void parent() {
        System.out.println(1);
    }
}

class Level extends Multi {
    void child() {
        System.out.println(2);
    }
}

class Inheritance extends Level {
    void child() {
        System.out.println(3);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Multi multi = new Multi();
        multi.parent();

        Level level = new Level();
        level.child();

        Inheritance inheritance = new Inheritance();
        inheritance.child();
    }
}
