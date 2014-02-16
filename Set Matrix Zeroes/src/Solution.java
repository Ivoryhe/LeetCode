/**
 * Feb-15-2014
 * @author Ivoryhe
 * Set Matrix Zeroes
 * 
 * Given a m x n matrix, if an element is 0, 
 * set its entire row and column to 0. Do it in place.
 * click to show follow up.
 * Follow up:
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstRow = false;
        boolean firstColumn = false;
        
        for(int i=0; i<m; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        
        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0){
                firstColumn = true;
                break;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i=1; i<m; i++){
            if(matrix[0][i] == 0){
                for(int j=1; j<n; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        
        for(int i=1; i<n; i++){
            if(matrix[i][0] == 0){
                for(int j=1; j<m; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(firstRow == true){
            for(int i=0; i<m; i++){
                matrix[0][i] = 0;
            }
        }
        
        if(firstColumn == true){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}