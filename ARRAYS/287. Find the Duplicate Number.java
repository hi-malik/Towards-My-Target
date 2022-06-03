// Brute Force Sorting
// Time Complexity: O(nlogn)
// Space Complexity: O(1)

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) return nums[i];
        }
        return -1;
    }
}

// Better Using HashSet
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return i;
            else set.add(i);
        }
        return -1;
    }
}

// Better Using HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) > 1) return nums[i];
        }
        return -1;
    }
}