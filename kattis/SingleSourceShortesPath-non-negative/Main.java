import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;
 
import static java.util.stream.Collectors.*;
import static java.util.stream.IntStream.*;
import static java.util.function.Function.*;
 
public class Main
{
    private static List<List<Edge>> graph;
    private static Map<Integer, Float> cost;
 
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
 
        while (true) {
            int n = in.nextInt();
            int m = in.nextInt();
            int q = in.nextInt();
            int s = in.nextInt();
 
            if (n + m + q + s == 0) {
                break;
            }
 
            // Costs to each node
            cost = new HashMap<>();
 
            // Weighted Adjacency Matrix
//            graph = new ArrayList<>();
 
//            // All nodes have no adjacency initially
//            for (int i = 0; i < n; i++) {
//                graph.add(new ArrayList<>());
//            }
 
            // Add edges to adjacency Matrix
            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int w = in.nextInt();
 
                graph.get(u).add(new Edge(v, w));
            }
 
            // Calculate costs
//            search(s);
 
            // Handle queries
            for (int i = 0; i < q; i++) {
                int query = in.nextInt();
 
                System.out.println(cost.containsKey(query) ? (int) cost.get(query).floatValue() : "Impossible");
            }
 
            System.out.println();
        }
    }
 
    private static void search(int start) {
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>((n1, n2) -> (int) (n1.cost - n2.cost));
 
        queue.add(new Edge(start, 0));
 
        while (!queue.isEmpty()) {
            Edge node = queue.poll();
 
            if (cost.containsKey(node.index)) {
                continue;
            }
 
            cost.put(node.index, node.cost);
 
            for (Edge neighbor: graph.get(node.index)) {
                float weight = cost.get(node.index) + neighbor.cost;
                queue.add(new Edge(neighbor.index, weight));
            }
        }
    }
 
    private static class Edge {
        public int index;
        public float cost;
 
        public Edge(int index, float cost) {
            this.index = index;
            this.cost = cost;
        }
    }
}
