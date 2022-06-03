// Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] < prices[j]){
                    max = Math.max(max, Math.abs(prices[i] - prices[j]));
                }
            }
        }
        return max;
    }
}


// Better Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            
            profit = prices[i] - lsf;
            
            if(op < profit) op = profit;
        }
        return op;
    }
}