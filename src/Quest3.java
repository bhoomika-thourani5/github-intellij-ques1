import java.util.*;

class Quest3 {

    private Map<Character, List<Character>> graph;
    private List<Character> vertices;

    Quest3(List<Character> vertices) {
        this.vertices = vertices;
        graph = new HashMap<>();

        for (char v : vertices) {
            graph.put(v, new ArrayList<>());
        }
    }

    // Add Edge
    void addEdge(char u, char v) {
        graph.get(u).add(v);
    }

    // Utility function for Topological Sort
    void topoSortUtil(char v, Set<Character> visited, LinkedList<Character> stack) {

        visited.add(v);

        for (char neighbor : graph.get(v)) {
            if (!visited.contains(neighbor)) {
                topoSortUtil(neighbor, visited, stack);
            }
        }

        stack.addFirst(v);
    }

    List<Character> topologicalSort() {

        Set<Character> visited = new HashSet<>();
        LinkedList<Character> stack = new LinkedList<>();

        for (char v : vertices) {
            if (!visited.contains(v)) {
                topoSortUtil(v, visited, stack);
            }
        }

        return stack;
    }

    public static void main(String[] args) {

        List<Character> vertices = Arrays.asList(
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z'
        );

        Quest3 g = new Quest3(vertices);

        // Add edges
        g.addEdge('m', 'q');
        g.addEdge('m', 'r');
        g.addEdge('m', 'x');

        g.addEdge('n', 'q');
        g.addEdge('n', 'u');
        g.addEdge('n', 'o');

        g.addEdge('o', 'r');
        g.addEdge('o', 's');
        g.addEdge('o', 'v');
        g.addEdge('o', 'p');

        g.addEdge('p', 'w');

        g.addEdge('q', 't');

        g.addEdge('r', 'u');
        g.addEdge('r', 'y');

        g.addEdge('s', 'r');

        g.addEdge('u', 't');

        g.addEdge('v', 'w');

        g.addEdge('x', 'z');
        g.addEdge('y', 'z');

        List<Character> order = g.topologicalSort();

        System.out.println("Topological Sort Order:");
        System.out.println(order);
    }
}