public class Throw {
    public int Eligible(int a)  {
        if(a<18){
            throw new  ArithmeticException("You are not eligible");


        }
        else{
            System.out.println("You are eligible to vote");
        }
        return 0;
    }
    public static void main(String[] args) {
        Throw t = new Throw();
        t.Eligible(19);
    }
}
