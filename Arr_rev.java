import java.util.*;
class Arr_rev{
public static void main(String[]args){
int ar[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements:");
 int n=sc.nextInt();
for(i=0;i<n;i++)
{

ar[i]=sc.nextInt();

}
System.out.println("elements in array before reversing:");
for(i=0;i<n;i++)
{
System.out.println(ar[i]);
}
System.out.println("elements in array after reversing:");
for(i=n-1;i>=0;i--)
{
System.out.println(+ar[i]);
}

}
}
