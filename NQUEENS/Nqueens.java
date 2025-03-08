import java.util.*;
class Nqueens{
	static int[] x;
	public static boolean place(int k,int i){
		for(int j=1;j<k;j++)
			if(x[j] == i || Math.abs(x[j]-i)== Math.abs(j-k))
				return false;
		return true;
}
public static void nqueens(int k,int n){
	if(k>n){
		for(int i=1;i<=n;i++)
			System.out.println(x[i] + " ");
		System.out.println();
	}
	else
		for(int i=1;i<=n;i++)
			if(place(k,i)){
				x[k]=i;
				Nqueens(k+1,n);
	}

}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of Queens:");
	int n=sc.nextInt();
	sc.close();
	x=new int[n+1];
	nqueens(1,n);
	


}



}
