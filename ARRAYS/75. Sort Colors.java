// Brute sorting:
// Time Complexity: O(nlogn)
// Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

// Better using 2-Poiners
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0) return;
        int i = 0;
        int j = nums.length;
        int zero = -1;
        
        while(i < j){
            if(nums[i] == 0){
                zero++;
                swap(nums, zero, i);
                i++;
            }
            else if(nums[i] == 1) i++;
            else if(nums[i] == 2){
                j--;
                swap(nums, i, j);
            }
        }
    }
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Better count
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) countZero++;
            else if(nums[i] == 1) countOne++;
            else if(nums[i] == 2) countTwo++;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i < countZero) nums[i] = 0;
            else if(i < countZero + countOne) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}