import java.util.*;
class CLA{
	public static void main(String[]args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no of elements:");
			int ar[]=new int[sc.nextInt()];
			int i;

			System.out.println("enter the elements:");

				for(i=0;i<ar.length;i++)
					{

						ar[i]=sc.nextInt();

					}
			System.out.println("elements in array before reversing:");
				for(i=0;i<ar.length;i++)
					{
						System.out.println(ar[i]);
					}
			System.out.println("elements in array after reversing:");
				for(i=ar.length-1;i>=0;i--)
					{
					System.out.println(+ar[i]);
					}

	}
}
