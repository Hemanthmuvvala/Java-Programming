import java.util.*;

public class BFSList {
     int v;
        LinkedList<Integer> adj[]; 
       
        BFSList(int v){
            this.v=v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }
        public void add(int src,int dest){
                adj[src].add(dest);
                adj[dest].add(src);
                }
            public  void BFS(int start){
                boolean visited [] = new boolean[v];
            Arrays.fill(visited, false);
            Queue <Integer> q= new LinkedList<>();
            q.add(start);
            visited[start]=true;
            while(!q.isEmpty())
            {
                int w=q.poll();
                System.out.print(w+" ");
                for (int i:adj[w]) {
                    if(!visited[i]){
                        visited[i]=true;
                        q.add(i);
                    }
                }

            }
        }

    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertex and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        BFSList b= new BFSList(v);
        System.out.println("Enter the source and the destination");
        for (int i = 0; i < e; i++) {
            int src=sc.nextInt();
            int dest=sc.nextInt();
            b.add(src, dest);
            
        }
        System.out.println("Enter the starting vertex");
        int start=sc.nextInt();

        b.BFS(start);
    }
}
