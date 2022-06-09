// Brute Approach linear search
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}

// Better Approach Binary Search
// Time Complexity: O(log(m*n))
// Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = (m * n) - 1;
        
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(matrix[mid / m][mid % m] == target) return true;
            else if(matrix[mid / m][mid % m] < target) i = mid + 1;
            else j = mid - 1;
        }
        return false;
    }
}

// Better Approach left & down move
// Time Complexity: O(log(m))
// Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = (m * n) - 1;
        
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(matrix[mid / m][mid % m] == target) return true;
            else if(matrix[mid / m][mid % m] < target) i = mid + 1;
            else j = mid - 1;
        }
        return false;
    }
}