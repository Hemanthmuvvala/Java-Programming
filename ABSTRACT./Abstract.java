import java.util.Scanner;

abstract  class A{
    abstract void square();
}
abstract  class B extends A{
    abstract void rectangle();
}
abstract  class C extends B{
    abstract void square();
}
abstract  class D extends C{
    abstract void square();
}

public class Abstract extends D {
    Scanner sc=new Scanner(System.in);
    void square(){
        System.out.println("Enter the side length.");
        double a=sc.nextInt();
        System.out.println("area of the square"+(a*a));
    }
    void rectangle(){
        System.out.println("Enter the side length and breadth.");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("area of the rectangle"+(l*b));

    }
    void circle(){
        System.out.println("enter the radius of the circle");
         double d=sc.nextDouble();
       float pi=3.14f;
       System.out.println("area of the circle"+(pi*d*d));
    }
    public static void main(String[] args) {
        Abstract a=new Abstract();
        a.circle();
        a.square();
        
    }
    
}
