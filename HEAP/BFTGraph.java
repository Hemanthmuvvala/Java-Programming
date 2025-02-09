import java.util.LinkedList;
import java.util.Queue;

public class BFTGraph {
    private int[][] adj;
    private int v;

    public BFTGraph(int v) {
        this.v = v;
        adj = new int[v][v];
    }

    public void addEdge(int s, int d) {
        adj[s][d] = 1;
        adj[d][s] = 1;
    }

    public void bft(int start) {
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        vis[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i = 0; i < v; i++) {
                if (adj[node][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFTGraph g = new BFTGraph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        
        System.out.println("BFT starting from 0:");
        g.bft(0);
    }
}
