import java.util.*;

class Exception {
    public static void main(String[] args) {
        int i, total = 0;
        int j = 10;
        for (i = 10; i >= 0; i--) {
            try {
                total = j / i;
                System.out.println(total);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero encountered when i = " + i);
            }
        }
    }
}
//OUTPUT
1
1
1
1
1
2
2
3
5
10
Error: Division by zero encountered when i = 0
