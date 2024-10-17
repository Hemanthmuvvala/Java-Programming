import java.util.*;

class MulExcep {
    public static void main(String[] args) {
        //System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements");
        
        try {
            for (int i = 0; i <=7; i++) {
                arr[i] = sc.nextInt();
                
            }
        }  catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("General exception: "+e.getMessage());
        
    }
}
}
//output
1
2
3
34
4
5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
