

import java.util.Arrays;

class Item{
int weight,profit;
double ratio;

     Item(int weight,int profit) {
        this.weight=weight;
        this.profit=profit;
        this.ratio=(double) profit/weight ;
    }

}
public class GreedyFractionalKnapssack {
   public static double getMaxProfit(Item[] items,int m){
                    Arrays.sort(items,(a,b) -> Double.compare(b.ratio, a.ratio));
                    double maxprofit=0.0;
                    for (Item item:items) {
                        if(item.weight<=m){
                            maxprofit+=item.profit;
                            System.out.println("Item: (Weight: " + item.weight + ", profit: " + item.profit + ") - Taken Fully");
                            m-=item.weight;
                        }
                        else{
                            double fraction=(double) m/item.weight;
                            maxprofit+=fraction*item.profit;
                            System.out.println("Item: (Weight: " + item.weight*fraction + ",profit: " + item.profit*fraction + ") - Taken " + fraction * 100 + "%");
                                break;
                        }
                    }
                    return maxprofit;
   }
    public static void main(String[] args) {
        Item[] items={new Item(10,60),new Item(20,100),new Item(30,120)};
        int m=50;
       double maxprofit= getMaxProfit(items, m);
       System.out.println("The total profit is equal to :"+maxprofit);
    }
}
