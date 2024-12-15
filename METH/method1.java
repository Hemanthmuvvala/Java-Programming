import java.util.*;

class MethodO {
    public static int Mul(int a, int b) {
        return a * b;
    }

    public static double Mul(double a, double b) {
        return a * b;
    }

    public static int Mul(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of a and b = " + Mul(a, b));

        System.out.println("Enter the value of x and y (double)");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("The product of x and y = " + Mul(x, y));

        System.out.println("Enter the value of a, b, and c");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("The product of a, b, and c = " + Mul(a1, b1, c1));
    }
}
