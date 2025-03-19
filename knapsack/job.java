
import java.util.*;
class Job{
    int id,profit,deadline;
    Job(int id,int profit,int deadline){
        this.id = id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
public class Jobsequencingwithdeadlines {
  public static int jobseq(Job[] jobs){
  int max=0;
  int n = jobs.length;
  boolean visted[] = new boolean[n];
  int result[] = new int[n];
  Arrays.sort(jobs,(a,b)->(b.profit-a.profit));
  for(Job j:jobs){
    for(int i= j.deadline-1;i>=0;i--){
        if(!visted[i]){
            visted[i]=true;
            result[i] = j.id;
            max = max+j.profit;
            break;
        }

    }
  }
  System.out.println("jobs selected:");
  for(int i=0;i<result.length;i++){
    if(result[i]!=0){
    System.out.print(result[i]+" ");
  }
}
  System.out.println();
  return max;
    
}
public static void main(String[] args){
    Job[] jobs = { new Job(1, 35, 3),
                   new Job(2, 30, 4),
                   new Job(3, 25, 4),
                   new Job(4, 20, 2),
                   new Job(5, 15, 3),
                   new Job(6, 12, 1),
                   new Job(7, 5, 2)
                 };
    int m = jobseq(jobs);
    System.out.println("max profit:"+m);
}
}
