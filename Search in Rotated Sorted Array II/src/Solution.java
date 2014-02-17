/**
 * Feb-16-2014
 * @author Ivoryhe
 * Search in Rotated Sorted Array II
 * 
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * Would this affect the run-time complexity? How and why?
 * Write a function to determine if a given target is in the array.
 */
public class Solution {
    public boolean search(int[] A, int target) {
        int start = 0;
        int end = A.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(A[mid] == target) {
                return true;
            }
            
            if(A[mid] < A[start]){//right site sorted
                if(target <= A[end] && target > A[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else if(A[mid] > A[start]){//left site sorted
                if(target < A[mid] && target >= A[start]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                start++;
            }
        }
        return false;
    }
}