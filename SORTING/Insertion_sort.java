import java.util.Scanner;

public class Insertion_sort {

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


    public static void sort(int a[],int n)
    {
        int i,j,key;
        for(i=1; i<n; i++) 
        {
      
            key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j=j-1;
                   
            }
            a[j+1]=key;
            
            
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
