// Better BFS or Kahn's Algorithm
// Time Complexity: O(N+E)
// Space Complexity: O(N) + O(N)

// GFG - https://practice.geeksforgeeks.org/problems/topological-sort/1

// Day-1 complete at 8thJune2022

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Queue<Integer> q = new LinkedList<>();
        int indegree[] = new int[V + 1];
        int topo[] = new int[V];
        // filling indegree array
        for(int i = 0; i < V; i++){
            for(Integer it : adj.get(i)){
                indegree[it]++;
            }
        }
        // filling queue whose indegree is 0 intially
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0) q.add(i);
        }
        int i = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            topo[i++] = node;
            
            for(Integer it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
}