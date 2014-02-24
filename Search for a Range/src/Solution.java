/**
 * Feb-23-2014
 * @author Ivoryhe
 * Search for a Range
 * 
 * Given a sorted array of integers, 
 * find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class Solution {
    public int[] searchRange(int[] A, int target) {
        int len = A.length;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        helper(A,0,len-1,target,result);
        return result;
    }
    
    public void helper(int[] A, int start, int end, int target,int[] result){
        if(start>end) {return;}
        int mid = (start+end)/2;
        if(A[mid] < target){
            helper(A,mid+1,end,target,result);
        }
        else if(A[mid] > target){
            helper(A,start,mid-1,target,result);
        }
        else{
            int left = mid;
            int right = mid;
            while(left > 0 && A[left-1] == target){
                left--;
            }
            while(right < A.length-1 && A[right+1] == target){
                right++;
            }
            result[0] = left;
            result[1] = right;
        }
    }
}