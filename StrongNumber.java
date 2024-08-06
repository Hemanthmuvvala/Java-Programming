import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        int sum = 0;
        int a, t, rem;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        t = a;
        
        while (a > 0) {
            rem = a % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            a /= 10;
        }
        
        if (sum == t) {
            System.out.println("The given number is a strong number");
        } else {
            System.out.println("The given number is not a strong number");
        }
        
        sc.close();
    }
}
