// Better
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < target.length(); i++){
            map2.put(target.charAt(i), map2.getOrDefault(target.charAt(i), 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for(Character i : map2.keySet()){
            if(map1.containsKey(i)) ans = Math.min(ans, map1.get(i) / map2.get(i));
            else return 0;
        }
        return ans;
    }
}