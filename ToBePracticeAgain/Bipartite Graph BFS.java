// Better BFS
// Time Complexity :- O(N+E)
// Space Complexity :- O(N + E) + O(N) + O(N)
// problem GFG link :- https://practice.geeksforgeeks.org/problems/bipartite-graph/1

class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[] = new int[V + 1];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < V; i++){
            if(color[i] == -1){
                if(!bfs(i, color, adj)) return false;
            }
        }
        return true;
    }
    public boolean bfs(int node, int color[], ArrayList<ArrayList<Integer>>adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 0;
        
        while(!q.isEmpty()){
            int nde = q.poll();
            for(Integer i : adj.get(nde)){
                if(color[i] == -1){
                    q.add(i);
                    color[i] = 1 + color[nde];
                }
                else if(color[i] == color[nde]) return false;
            }
        }
        return true;
    }
}