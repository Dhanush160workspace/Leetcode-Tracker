// Last updated: 7/11/2026, 9:37:44 PM
1class Solution {
2    public int countCompleteComponents(int v, int[][] edges) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for (int i=0; i<v; i++){
5            adj.add(new ArrayList<>());
6        }
7        for (int i=0; i<edges.length; i++){
8            int sv = edges[i][0];
9            int ev = edges[i][1];
10            adj.get(sv).add(ev);
11            adj.get(ev).add(sv);
12        }
13        boolean visited[] = new boolean[v];
14        int ans = 0;
15        for (int i=0; i<v; i++){
16            if (!visited[i]){
17                if (bfs(i, adj, visited))
18                    ans++;
19            }
20        }
21        return ans;
22    }
23    public static boolean bfs(int sv, List<List<Integer>> adj, boolean visited[]){
24        Queue<Integer> q = new LinkedList<>();
25        q.add(sv);
26        visited[sv] = true;
27        int nc =0;
28        int ec =0;
29        while(!q.isEmpty()){
30            int ele = q.poll();
31            nc++;
32            ec += adj.get(ele).size();
33            for (int num:adj.get(ele)){
34                if (!visited[num]){
35                    visited[num] = true;
36                    q.add(num);
37                }
38            }
39        }
40        return ec == nc * (nc-1);
41    }
42}