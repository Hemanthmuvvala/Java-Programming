//import java.util.Scanner;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        int f=0;
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
                if(n%i==0)
                f++;



        }
        if(f==2)
        System.out.println("It is a prime number");
        else
        System.out.println("it is not a prime number");

    }
    
}
