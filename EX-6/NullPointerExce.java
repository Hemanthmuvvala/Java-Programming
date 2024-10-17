//It is a builtin exception in java.it is one of the example foe bilt in exceptions.
public class NullPointerExce {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception" + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
//output
Cannot invoke "String.length()" because "str" is null
