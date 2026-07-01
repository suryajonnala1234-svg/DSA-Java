import java.util.*;
public class DFSEXAMPLE {
    private int vertices;
    private List<List<Integer>> adjList;
    public DFSEXAMPLE(int vertices){
        this.vertices=vertices;
        adjList = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjList.add(new LinkedList<>());
        }
    }
    public void addEdge(int start,int destination){
        adjList.get(start).add(destination);
        adjList.get(destination).add(start);
    }
    public void dfs(int node,boolean visited[]){
        visited[node]=true;
        System.out.print(node+" ");
       for(int neighbour:adjList.get(node)){
        if(!visited[neighbour])
        dfs(neighbour,visited);
       }
    }

    public static void main(String[] args) {
        DFSEXAMPLE graph=new DFSEXAMPLE(6);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        boolean visited[]=new boolean[6];
        System.out.println("DFS Traversal:");
        graph.dfs(0,visited);

    }
}