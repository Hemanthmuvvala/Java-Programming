import java.util.Scanner;

public class Linear_search {

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

    

    public static void search(int ar[],int n,int key)
    {
        int i,pos=-1;
        
        System.out.printf("Enter the key element to find the index pos: \n");
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(ar[i]==key)
            {
                pos=i;
                break;
            }
        }
        if(pos>=0)
            System.out.println("Element is found at"+i);
        else
            System.out.println("Element not found");
    }
    

    public static void main(String[] args) {
        int n, key;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        
        System.out.println("Enter the elements of the array:");
        readarr(arr, n);
        
       
        
        System.out.println("The array after sorting:");
        printarr(arr, n);
        
        search(arr, n, 0);
    }
}
