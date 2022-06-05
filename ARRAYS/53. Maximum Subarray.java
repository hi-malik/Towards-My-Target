// Brute
// Time Complexity: O(N^2)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum > max) max = sum;
            }
        }
        return max;
    }
}

// Better Kadane Algo
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(curr > max) max = curr;
            if(curr <= 0) curr = 0;
        }
        return max;
    }
}