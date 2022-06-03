// Brute HashSet
// Time Complexity: O(nlogn) + O(n); nlogn for instering into hashset & n for getting from set and putting into array
// Space Complexity: O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans = set.size();
        int x = 0;
        for(int i : set){
            nums[x++] = i;
        }
        
        return ans;
    }
}

// Better 2-pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i] != nums[j])
                i++;
            nums[i] = nums[j];
        }
        return i + 1; // by doing that we will simply get our index as answer;
    }
}
/* Explanation :-
Example ;- [1,1,2]

Step-1 :- similar, move j++;
[1,1,2]
 i j
 
Step-2 :- not similar, move i++ & replace nums[i] value with nums[j] value
[1,1,2]
 i   j
 
Therefore, [1,2,1] & return i + 1 value, so that we can get the exact mathematical index
              i
*/