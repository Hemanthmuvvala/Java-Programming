import java.util.Scanner;

public class Binary_search {

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

    public static void sort(int ar[], int n) {
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

    public static void search(int ar[], int n, int key) {
        int start = 0, end = n - 1, mid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to find the position:");
        key = sc.nextInt();
        
        while (start <= end) {
            mid = (start + end) / 2;
            if (key == ar[mid]) {
                System.out.printf("The key %d is found at the position=%d%n", key, mid + 1);
                return;
            } else if (key < ar[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("The key is not found");
    }

    public static void main(String[] args) {
        int n, key;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        
        System.out.println("Enter the elements of the array:");
        readarr(arr, n);
        
        sort(arr, n);
        
        System.out.println("The array after sorting:");
        printarr(arr, n);
        
        search(arr, n, 0);
    }
}
