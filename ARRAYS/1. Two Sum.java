// Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}

// Better HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                int index = map.get(res);
                if(index == i) continue;
                return new int[]{i, index};
            }
        }
        return null;
    }
}