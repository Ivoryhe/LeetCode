/**
 * Feb-16-2014
 * @author Ivoryhe
 * Spiral Matrix II
 * 
 * Given an integer n, generate a square matrix filled with 
 * elements from 1 to n2 in spiral order.
 * 
 * For example,
 * Given n = 3,
 * You should return the following matrix:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        if(n <=0) {return matrix;}
        
        int step = 0;
        if(n == 1){
            step = 1;
        }
        else{
            step = n-1;
        }
        
        int circle = (n+1)/2 - 1;
        int count = 1;
        int max = n*n;
        for(int i=0; i<=circle; i++){
            int j=i;

            //top
            while(j<step+i && count<=max){
                matrix[i][j] = count;
                count++;
                j++;
            }
            
            //right
            j=i;
            while(j<step+i && count<=max){
                matrix[j][n-1-i] = count;
                count++;
                j++;
            }

            //down
            j=i;
            while(j<step+i && count<=max){
                matrix[n-1-i][n-1-j] = count;
                count++;
                j++;
            }
            
            //left
            j=i;
            while(j<step+i && count<=max){
                matrix[n-1-j][i] = count;
                count++;
                j++;
            }
            step = step -1;
            if(step == 1){
                step = 1;
            }
            else{
                step = step-1;
            }
        }
        return matrix;
    }
}