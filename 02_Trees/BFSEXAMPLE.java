import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSEXAMPLE {

    private int vertices;
    private List<List<Integer>> adjList;

    public BFSEXAMPLE(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Add an undirected edge
    public void addEdge(int start, int destination) {
        adjList.get(start).add(destination);
        adjList.get(destination).add(start);
    }

    // Breadth First Search
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbour : adjList.get(vertex)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFSEXAMPLE graph = new BFSEXAMPLE(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.println("BFS Traversal:");
        graph.bfs(0);
    }
}