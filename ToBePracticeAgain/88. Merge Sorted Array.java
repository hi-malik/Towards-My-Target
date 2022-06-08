// Brute Sorting
// Time Complexity: O(nlogn)
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

// Optimise using two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
while(i>=0 && j>=0){
	if(nums1[i]<nums2[j])
	{
		nums1[k--]=nums2[j--]; 
		// here nums2[j] is greater , so copy and decresase both
     }
     else
	 {
		 nums1[k--]=nums1[i--]; 
		 // here nums1[i] is greater/equal to , so copy and decresase both
      }
    }
	// if left over numbers
     while(j>=0) nums1[k--]=nums2[j--];
    }
}