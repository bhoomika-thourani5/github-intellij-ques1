import java.util.*;
public class Quest1 {

    public static void main(String[] args) {

        String[] vertices = {"A", "B", "C", "D"};
        int n = vertices.length;

        // Adjacency Matrix
        int[][] adjMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    adjMatrix[i][j] = 1;
                }
            }
        }
        // Print Matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Adjacency List
        HashMap<String, ArrayList<String>> adjList = new HashMap<>();

        for (int i = 0; i < n; i++) {

            ArrayList<String> connections = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    connections.add(vertices[j]);
                }
            }

            adjList.put(vertices[i], connections);
        }

        // Print List
        System.out.println("\nAdjacency List:");

        for (String key : adjList.keySet()) {
            System.out.println(key + ": " + adjList.get(key));
        }
    }
}