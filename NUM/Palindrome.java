import java.util.Scanner;

class Palindrome1 {
    public static void main(String[] args) {
        int sum = 0;
        int a, t, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        t = a;  
        
        while (a > 0) {
            rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;
        }
        
        if (sum != t) {
            System.out.println("The given number is not a palindrome");
        } else {
            System.out.println("The given number is a palindrome");
        }
        
       
    }
}
