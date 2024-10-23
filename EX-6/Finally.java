class Finally {
    public static void main(String[] args) {
        int i, total = 0;
        int j = 10;
        
            try {
                for (i = 10; i >= 0; i--) {
                total = j / i;
                System.out.println(total);
                }
            }
             catch (ArithmeticException e) {
                System.out.println(e);
            }
           finally{
               System.out.println("ok");
           }
            
        }
        
    }
