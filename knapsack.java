import java.util.*;
import java.util.Arrays;
import java.util.Comparator;


public class knapsack
 {
    public static double Getmaxvalue(Itemvalue[] arr, int capacity)
    {
        Arrays.sort(arr,new Comparator<Itemvalue>()
        {
            public int compare(Itemvalue item1,Itemvalue item2)
            {
                double cpr1=(double)item1.profit/(double)item1.weight;
                double cpr2=(double)item2.profit/(double)item2.weight;
                if(cpr1<cpr2)
                {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
    
    double totalmax=0d;
    for(Itemvalue i:arr)
    {
        int curvl=(int)i.profit;
        int curwt=(int)i.weight;
        if(capacity-curwt>=0)
        {
            capacity=capacity-curwt;
            totalmax=totalmax+curvl;
        }
        else
        {
            double fraction=(double)capacity/curwt;
            totalmax=totalmax+(fraction*curvl);
            capacity=0;
            break;
        }
      }
    
    return totalmax;
    }


static class Itemvalue 
{
    int profit,weight;
    public  Itemvalue( int vl, int wt)
    {
        this.profit=vl;
        this.weight=wt;
    }
}


public static void main(String args[])
{
    Itemvalue[] arr={ new Itemvalue(60,10),
                     new Itemvalue(100,20),
                    new Itemvalue(120,30)};
    int capacity=50;
    double maxvalue=Getmaxvalue(arr,capacity);
    
    System.out.println(maxvalue);
}
}




