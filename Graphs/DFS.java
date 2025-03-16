import java.util.*;
public class DFS {
    int v;
    int adjMatrix[][];
    boolean visited[];
         DFS(int v){
            this.v=v;
            adjMatrix=new int[v][v];
            visited= new boolean[v];
            Arrays.fill(visited,false);
         }
    public void DFS_Traverse(int start){
            visited[start]=true;
            System.out.print(start+" ");
            for(int i=0;i < v; i++){
                if(!visited[i] && adjMatrix[start][i]==1)
                    DFS_Traverse(i);
            }

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the no of vertices:");
        int v=sc.nextInt();
        DFS obj = new DFS(v);
       
        System.out.print("Enter the matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++){
                obj.adjMatrix[i][j]=sc.nextInt();
            }
            
        }

        System.out.print("Enter the starting vertex:");
        int start=sc.nextInt();
        obj.DFS_Traverse(start);

        
    }
}
