package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BreadthFirstSearch
 */
public class BreadthFirstSearch {

    public ArrayList<Integer> bfsTraverse(int no, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> output = new ArrayList<>();
        boolean visited[] = new boolean[no];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            output.add(node);

            for (Integer i : adj.get(node)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

        return output;
    }
}