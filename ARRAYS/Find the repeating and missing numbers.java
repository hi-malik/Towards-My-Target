// InterviewBit :- https://www.interviewbit.com/problems/find-the-repeating-and-missing-numbers/
/* 
Question :-
Problem Statement: You are given a read-only array of N integers with values also in the range [1,N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Example 1:

Input Format:  array[] = {3,1,2,5,3}

Result: {3,4)

Explanation: A = 3 , B = 4 
Since 3 is appearing twice and 4 is missing
Example 2:

Input Format: array[] = {3,1,2,5,4,6,7,5}

Result: {5,8)

Explanation: A = 5 , B = 8 
Since 5 is appearing twice and 8 is missing
*/

// Better using Set
// Time Complexity: O(n)
// Space Complexity: O(n)

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        Set<Integer> set = new HashSet<>();
        int res[] = new int[2];
        int k = 0;
        for(int i : A){
            if(set.contains(i)) res[k++] = i;
            set.add(i);
        }
        for(int i = 0; i < A.length; i++){
            if(!set.contains(i)) res[k++] = i;
        }
        return res;
    }
}
