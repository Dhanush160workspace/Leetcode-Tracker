// Last updated: 7/9/2026, 3:06:20 PM
class Solution {
    public int countCompleteComponents(int v, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0; i<edges.length; i++){
            int sv = edges[i][0];
            int ev = edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        boolean visited[] = new boolean[v];
        int ans = 0;
        for (int i=0; i<v; i++){
            if (!visited[i]){
                if (bfs(i, adj, visited))
                    ans++;
            }
        }
        return ans;
    }
    public static boolean bfs(int sv, List<List<Integer>> adj, boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        visited[sv] = true;
        int nc =0;
        int ec =0;
        while(!q.isEmpty()){
            int ele = q.poll();
            nc++;
            ec += adj.get(ele).size();
            for (int num:adj.get(ele)){
                if (!visited[num]){
                    visited[num] = true;
                    q.add(num);
                }
            }
        }
        return ec == nc * (nc-1);
    }
}