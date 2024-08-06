
import java.util.Scanner;

class Arm_strong {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int sum = 0;
        int a, t, rem;
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = sc.nextInt();
        t = a; // Initialize t with the original value of a
        
        while (a > 0) {
            rem = a % 10;
            sum = sum * 10 + (int)Math.pow(rem,3);
            a = a / 10;
        }
        
        if (sum==t) {
            System.out.println("The given number is an armstrong number");
        } else {
            System.out.println("The given number is not an armstrong number");
        }
        
       // sc.close(); // Close the scanner
    }
}

