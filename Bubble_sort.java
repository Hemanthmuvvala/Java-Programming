//implementing bubble sort
import java.util.*;
class Bubble_sort{
static void readarr(int ar[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
    }

    static void printarr(int ar[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", ar[i]);
        }
        System.out.println();
    }

    public static void swap(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public static void Sort(int ar[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j]) {
                    int[] a = {ar[i]};
                    int[] b = {ar[j]};
                    swap(a, b);
                    ar[i] = a[0];
                    ar[j] = b[0];
                }
            }
        }
    }
public static void main(String[]args)
{
int i,n;
int ar[]=new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of elements in array");
n=sc.nextInt();
System.out.println("Enter the  elements of array");
readarr(ar,n);
System.out.println("elements in array:");
printarr(ar,n);
System.out.println("The elements after sorting:");
Sort(ar,n);
printarr(ar,n);
}
}
