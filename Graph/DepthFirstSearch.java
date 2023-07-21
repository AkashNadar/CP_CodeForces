package Graph;

import java.util.ArrayList;

public class DepthFirstSearch {
    public static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> op) {
        visited[node] = true;
        op.add(node);
        for (Integer n : adj.get(node)) {
            if (!visited[n]) {
                dfs(n, visited, adj, op);
            }
        }
    }

    public ArrayList<Integer> dfsTraverse(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[v + 1];
        ArrayList<Integer> output = new ArrayList<>();
        dfs(0, visited, adj, output);
        return output;
    }
}
