import java.util.*;

class SumOfSubsets {
    static List<Integer> subset = new ArrayList<>();
    static int set[];
    static int m;

    public static void subsets(int csum, int k, int rsum) {
        if (csum == m) {
            System.out.println(subset); 
            return;
        }

        if (k >= set.length || csum + set[k] > m || csum + rsum < m) {
            return; 
        }

     
        subset.add(set[k]);
        subsets(csum + set[k], k + 1, rsum - set[k]);

        // Exclude set[k] from the subset
        subset.remove(subset.size() - 1); // Backtrack
        subsets(csum, k + 1, rsum - set[k]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = sc.nextInt();
        set = new int[n];
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            set[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        m = sc.nextInt();

        Arrays.sort(set); 
        int totalSum = 0;
        for (int num : set) {
            totalSum += num;
        }

        subsets(0, 0, totalSum);
    }
}