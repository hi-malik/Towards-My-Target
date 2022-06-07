// Better DFS
// Time Complexity :- O(N+E)
// Space Complexity :- O(N + E) + O(N) + O(N)
// GFG - https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/

// Day 1 complete i.e. 7thJune2022

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[] = new int[V + 1];
        int dfsVis[] = new int[V + 1];
        Arrays.fill(vis, 0);
        Arrays.fill(dfsVis, 0);
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                if(dfs(i, vis, dfsVis, adj)) return true;
            }
        }
        return false;
    }
    public boolean dfs(int node, int vis[], int dfsVis[], ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        dfsVis[node] = 1;
        
        for(Integer i : adj.get(node)){
            if(vis[i] == 0){
                if(dfs(i, vis, dfsVis, adj)) return true;
            }
            else if(dfsVis[i] == 1) return true;
        }
        dfsVis[node] = 0;
        return false;
    }
}