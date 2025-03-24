import java.util.*;
public class StringEditing {
        public static int minEditDistance(String X,String Y){
            int m=X.length(),n=Y.length();
            int c[][]=new int[m+1][n+1];
            for (int i = 0; i <=m; i++) {
                c[i][0]=i;
            }
            for (int j = 0; j <=n; j++) {
                c[0][j]=j;
            }
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <=n; j++) {
                    if(X.charAt(i-1)==Y.charAt(j-1))
                        c[i][j]=c[i-1][j-1];
                    else{
                        c[i][j]=Math.min(c[i-1][j-1]+2,Math.min(c[i-1][j]+1, c[i][j-1]+1) );
                    }

                                    }
            }
            return c[m][n];
        }

            
        
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String X=sc.nextLine();
        String Y=sc.nextLine();
        sc.close();
        System.out.println(X.length());
        System.out.println("The minEdit distanace="+minEditDistance(X,Y));
        
    }
}
