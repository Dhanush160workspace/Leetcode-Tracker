// Last updated: 7/9/2026, 3:10:02 PM
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    ans++;
                    bfs(i, j, visited, grid, m, n);
                }
            }
        }
        return ans;
    }

    public static void bfs(int i, int j, boolean[][] visited, char[][] grid, int m, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;
        int[][] direc = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (q.size() > 0) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for (int k = 0; k < 4; k++) {
                int nextRow = x + direc[k][0];
                int nextCol = y + direc[k][1]; 
                if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n) {
                    if (!visited[nextRow][nextCol] && grid[nextRow][nextCol] == '1') {
                        q.add(new int[]{nextRow, nextCol});
                        visited[nextRow][nextCol] = true;
                    }
                }
            }
        }
    }
}