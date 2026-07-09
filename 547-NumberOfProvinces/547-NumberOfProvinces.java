// Last updated: 7/9/2026, 3:09:16 PM
import java.util.*;

class Solution {
    private void bfs(int[][] isConnected, boolean[] visited, int start, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int j = 0; j < n; j++) {
                if (isConnected[node][j] == 1 && !visited[j]) {
                    queue.add(j);
                    visited[j] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                bfs(isConnected, visited, i, n); 
            }
        }

        return provinces;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        int[][] testGraph = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };

        int result = solver.findCircleNum(testGraph);
        System.out.println("Total Provinces: " + result); 
    }
}