/**
 * Feb-15-2014 
 * @author Ivoryhe
 * Rotate Image
 * 
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = m/2 - 1;
        for(int i=0; i<=n; i++){
            for(int j=i; j<m-i-1; j++){
                int temp = matrix[i][j];
                //top
                matrix[i][j] = matrix[m-1-j][i];
                //left
                matrix[m-j-1][i] = matrix[m-i-1][m-j-1];
                //down
                matrix[m-i-1][m-j-1] = matrix[j][m-i-1];
                //right
                matrix[j][m-i-1] = temp;
            }
        }
    }
}