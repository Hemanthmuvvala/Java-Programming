import java.util.Scanner;

public class Quick_sort {

    public static void quickSort(int[] ar, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(ar, low, high);
            quickSort(ar, low, pivotIndex - 1);       
            quickSort(ar, pivotIndex + 1, high);      
        }
    }

    public static int partition(int[] ar, int low, int high) {
        int pivot = ar[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && ar[i] <= pivot) i++;
            while (i <= j && ar[j] > pivot) j--;
            if (i < j) {
                swap(ar, i, j); 
            }
        }
        swap(ar, low, j);
        return j;
    }

    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        long startTime = System.currentTimeMillis();

        quickSort(array, 0, n - 1);

        long endTime = System.currentTimeMillis();

        System.out.println("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nExecution Time: " + (endTime - startTime) + "milliseconds");

        sc.close();
    }
}

