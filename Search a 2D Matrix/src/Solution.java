/**
 * Feb-16-2014
 * @author Ivoryhe
 * Search a 2D Matrix
 * 
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * Consider the following matrix:
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rowNum = searchRow(0,n-1,matrix,target);
        int[] row = matrix[rowNum];
        int num = searchColumn(0,m-1,matrix,target,row);
        if(target == row[num]){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int searchRow(int start, int end, int[][] matrix, int target){
        if(start == end) {
            return start;
        }
        int mid = (start+end)/2;
        if(target >= matrix[mid+1][0]){
            return searchRow(mid+1, end, matrix, target); 
        }
        else{
            return searchRow(start, mid, matrix, target);
        }
    }
    
    public int searchColumn(int start, int end, int[][] matrix, int target, int[] row){
        if(start == end){
            return start;
        }
        
        int mid = (start+end)/2;
        if(target > row[mid]){
            return searchColumn(mid+1,end,matrix,target,row);
        }
        else{
            return searchColumn(start,mid,matrix,target,row);
        }
    }
}