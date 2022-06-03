// Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

// Better snowBall approach
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int snowBall = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                snowBall++;
            }
            else if(snowBall > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowBall] = temp;
            }
        }
    }
}