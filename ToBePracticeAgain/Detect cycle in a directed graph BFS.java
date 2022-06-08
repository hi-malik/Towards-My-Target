// Better BFS or Kahn's Algorithm
// Time Complexity: O(N+E)
// Space Complexity: O(N) + O(N)

// GFG - https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1

// Day-1 complete at 8thJune2022

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        int indegree[] = new int[V + 1];
        Arrays.fill(indegree, 0);
        for(int i = 0; i < V; i++){
            for(Integer it : adj.get(i)){
                indegree[it]++;
            }
        }
        
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(Integer i : adj.get(node)){
                indegree[i]--;
                if(indegree[i]==0) q.add(i);
            }
        }
        if(count == V) return false;
        return true;
    }
}
/* 
Explanation of line 34 :-
Okay so to clarify the (cnt == N) logic. Although it was a great explaination.
In Kahn's algorithm, a node only enters the queue if its indegree becomes zero and then it further decrements the indegree values of its adjacent nodes right. 
But in the case of cyclic graph , there will be a node from where the cycle will be starting and then coming to an end. 
So in order for the elements present in the cycle to get pushed into the queue, 
that cycle starting node's indegree must become zero right. But but but, that node's indegree will never become zero as one of the node from the cycle (the second last element) will be pointing towards the starting node. 
Just imagine with a diagram in the video. So if that node's indegree will never become zero , 
then it will restrict its adjacent nodes(at least) to get evaluated and hence the total number of nodes getting pushed into the queue (cnt) will never become (=N).
*/