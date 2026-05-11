import java.util.ArrayList;

public class Quest1 {
    static void matrix(int n) {

        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    graph[i][j] = 1;
                }
            }
        }
        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " ");
            }

            System.out.println();
        }
    }

    static void list(int n) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    graph.get(i).add(j);
                }
            }
        }
        System.out.println("\nAdjacency List:");

        for (int i = 0; i < n; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
    public static void main(String[] args) {
        int vertices = 4;
        matrix(vertices);
        list(vertices);
    }
}