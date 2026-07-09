// Last updated: 7/9/2026, 3:06:52 PM
import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        List<List<Integer>> ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ll.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            ll.get(u).add(v);
            ll.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] check = new boolean[n];

        q.add(source);
        check[source] = true;

        while (q.size() > 0) {
            int node = q.poll();

            if (node == destination) {
                return true;
            }

            int m = ll.get(node).size();
            for (int i = 0; i < m; i++) {
                int neighbor = ll.get(node).get(i);

                if (!check[neighbor]) {
                    q.add(neighbor);
                    check[neighbor] = true;
                }
            }
        }

        return false;
    }
}