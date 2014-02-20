/**
 * Feb-19-2014
 * @author Ivoryhe
 * Jump Game 
 * 
 * Given an array of non-negative integers, 
 * you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * For example:
 * A = [2,3,1,1,4], return true.
 * A = [3,2,1,0,4], return false.
 */
public class Solution {
    public boolean canJump(int[] A) {
        int n = A.length;
        if(n == 0) {return false;}
        if(A[0] == 0 && n != 1) {return false;}
        int[] dp = new int[n];
        dp[0] = A[0];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(dp[i-1]-1, A[i]);
            if(dp[i] == 0 && i != n-1){
                return false;
            }
        }
        return true;
    }
}