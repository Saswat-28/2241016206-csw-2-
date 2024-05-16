import java.util.LinkedList;
import java.util.List;
class GraphMatrix {
    private int[][] adjMatrix;
    public GraphMatrix(int numVertices) {
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // For undirected graph
    }

    public void displayMatrix() {
        for (int[] row : adjMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
class GraphList {
    private List<List<Integer>> adjList;
    private int numVertices;

    public GraphList(int numVertices) {
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

    public void displayList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer edge : adjList.get(i)) {
                System.out.print(" -> " + edge);
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int numVertices = 5;

        // Graph using Adjacency Matrix
        GraphMatrix graphMatrix = new GraphMatrix(numVertices);
        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(0, 4);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(1, 3);
        graphMatrix.addEdge(1, 4);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(3, 4);

        System.out.println("Adjacency Matrix:");
        graphMatrix.displayMatrix();

        // Graph using Adjacency List
        GraphList graphList = new GraphList(numVertices);
        graphList.addEdge(0, 1);
        graphList.addEdge(0, 4);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 3);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 4);

        System.out.println("Adjacency List:");
        graphList.displayList();
    }
}

