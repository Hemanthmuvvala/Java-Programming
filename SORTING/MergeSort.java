import java.util.Scanner;

public class MergeSort {
    public static int[] b;
    public static void mergesort(int a[],int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int a[],int low ,int mid,int high){
        int i=low,j=mid+1,k=low;
        while(i<=mid &&j<=high){
            if(a[j]>a[i]){
                b[k++]=a[i++];
            }
            else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=high){
            b[k++]=a[j++];
        }
        for(int h=low;h<=high;h++){
            a[h]= b[h];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        b = new int[n];
        int a[] =new int[n];
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergesort(a,0,n-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}