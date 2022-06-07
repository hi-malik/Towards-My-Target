// Brute Approach
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

class Solution {
    public void rotate(int[][] matrix) {
        int copy[][] = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                copy[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = copy[i][j];
            }
        }
    }
}

// Better Approach
// Time Complexity: O(N*N) + O(N*N).One O(N*N) for transposing the matrix and the other for reversing the matrix.
// Space Complexity: O(1)

class Solution {
    public void rotate(int[][] matrix) {
        //1st step transpose matrix :-
        clockwise(matrix);
        //2nd step reverse the matrix
        for(int k = 0; k < matrix.length; k++){
            int i = 0;
            int j = matrix[0].length - 1;
            
            while(i < j){
                int temp = matrix[k][i];
                matrix[k][i++] = matrix[k][j];
                matrix[k][j--] = temp;
            }
        }
    }
    public void clockwise(int matrix[][]){
        // Transpose means => turning rows into cols & cols into rows :}
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}