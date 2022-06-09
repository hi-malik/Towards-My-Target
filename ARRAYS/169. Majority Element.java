// Brute HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            
            if(map.get(i) > nums.length / 2) return i;
        }
        return -1;
    }
}

// Brute Sorting
// Time Complexity: O(nlogn)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

// Better Moyers Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for(int i : nums){
            if(count == 0) candidate = i;
            if(candidate == i) count++;
            else count--;
        }
        return candidate;
    }
}