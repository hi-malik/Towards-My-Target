// Better DFS
// Time Complexity :- O(N+E) 
// Space Complexity :- O(N + E) + O(N) + O(N)

class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[] = new int[V + 1];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < V; i++){
            if(color[i] == -1){
                if(!dfs(i, color, adj)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, int color[], ArrayList<ArrayList<Integer>>adj){
        // if(color[node] == -1) color[node] = 0;
        
        for(Integer i : adj.get(node)){
            if(color[i] == -1){
                color[i] = 1 - color[node];
                if(!dfs(i, color, adj)) return false;
            }
            else if(color[i] == color[node]) return false;
        }
        return true;
    }
}