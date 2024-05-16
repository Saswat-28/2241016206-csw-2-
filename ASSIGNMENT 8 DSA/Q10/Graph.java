package Q10;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
    private List<List<Integer>> adjList;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList<>();
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // For undirected graph
    }

    public void readGraph() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of edges:");
        int numEdges = scanner.nextInt();

        System.out.println("Enter the edges (source and destination pairs):");
        for (int i = 0; i < numEdges; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            addEdge(src, dest);
        }
    }

    public void displayList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer edge : adjList.get(i)) {
                System.out.print(" -> " + edge);
            }
            System.out.println();
        }
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new ArrayDeque<>();
        
        visited[startVertex] = true;
        queue.add(startVertex);
        
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            
            for (int adj : adjList.get(vertex)) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int numVertices = scanner.nextInt();

        Graph graph = new Graph(numVertices);

        graph.readGraph();

        System.out.println("Adjacency List:");
        graph.displayList();

        System.out.println("Enter the starting vertex for BFS:");
        int startVertex = scanner.nextInt();

        System.out.println("BFS traversal starting from vertex " + startVertex + ":");
        graph.BFS(startVertex);
    }
}
