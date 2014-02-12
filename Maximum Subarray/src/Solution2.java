/**
 * Feb-11-2014
 * @author Ivoryhe
 * Maximum Subarray 
 * 
 * Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest sum.
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * 
 * click to show more practice.
 * More practice:
 * If you have figured out the O(n) solution, 
 * try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class Solution2 {
    public int maxSubArray(int[] A) {
        int result = helper(0, A.length-1, A);
        return result;
    }
    
    public int helper(int start, int end, int[] A){
        if(start == end) {return A[start];}
        int mid = (start+end)/2;
        int left = helper(start, mid, A);
        int right = helper(mid+1, end, A);
        
        int sum = 0;
        int leftMax = Integer.MIN_VALUE;
        for(int i=mid; i>=start; i--){
            sum = sum + A[i];
            if(sum > leftMax){
                leftMax = sum;
            }
        }
        
        sum = 0;
        int rightMax = Integer.MIN_VALUE;
        for(int i=mid+1; i<=end; i++){
            sum = sum + A[i];
            if(sum > rightMax){
                rightMax = sum;
            }
        }
        
        return Math.max(Math.max(left, right),leftMax+rightMax);
    }
}