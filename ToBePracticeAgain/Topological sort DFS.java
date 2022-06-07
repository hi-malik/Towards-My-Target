// Better DFS
// Time Complexity: O(N+E)
// Space Complexity: O(N + E) + O(N) + O(N)

// GFG - https://practice.geeksforgeeks.org/problems/topological-sort/1

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> st = new Stack<>();
        int vis[] = new int[V + 1];
        Arrays.fill(vis, 0);
        
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        int topo[] = new int[V];
        int i = 0;
        while(!st.isEmpty()){
            topo[i++] = st.pop();
        }
        return topo;
    }
    public static void dfs(int node, int vis[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(Integer i : adj.get(node)){
            if(vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        st.push(node);
    }
}