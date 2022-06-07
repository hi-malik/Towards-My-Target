// Brute Force
// Time Complexity: O(n*log(n))+O(n)+O(n)
// Space Complexity: O(n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m + n];
        int k = 0;
        for(int i = 0; i < m; i++){
            res[k++] = nums1[i];
        }
        for(int i = 0; i < n; i++){
            res[k++] = nums2[i];
        }
        Arrays.sort(res);
        for(int i = 0; i < res.length; i++){
            nums1[i] = res[i];
        }
    }
}

// Better using pointers
// Time Complexity: O(n * m)
// Space Complexity: O(1)

// -> Not working

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i, k;
        for(i = 0; i < m; i++){
            // take first element from arr1 
            // compare it with first element of second array
            // if condition match, then swap
            if(nums1[i] > nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
            }
            // then sort the second array
            // put the element in its correct position
            // so that next cycle can swap elements correctly
            int first = nums2[0];
            // insertion sort is used here
            for(k = 1; k < n && nums2[k] < first; k++){
                nums2[k - 1] = nums2[k];
            }
            nums2[k - 1] = first;
        }
    }
}