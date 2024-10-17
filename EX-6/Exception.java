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
                System.out.println(e);
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
java.lang.ArithmeticException: / by zero
