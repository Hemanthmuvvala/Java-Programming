import java.util.Scanner;

public class Bubble_sort {

    static void readarr(int ar[], int n) {
        @SuppressWarnings("resource")
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

    /*public static void swap(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }*/

    public static void sort(int ar[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j]) {

                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int n;
        int[] arr = new int[100];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        
        System.out.println("Enter the elements of the array:");
        readarr(arr, n);
        
        sort(arr, n);
        
        System.out.println("The array after sorting:");
        printarr(arr, n);
        
       
    }
}
