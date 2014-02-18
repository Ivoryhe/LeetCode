/**
 * Feb-14-2014
 * @author Ivoryhe
 * Single Number II 
 * 
 * Given an array of integers, 
 * every element appears three times except for one. Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. 
 * Could you implement it without using extra memory?
 */
public class Solution {
    public int singleNumber(int[] A) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0; i<A.length; i++){
            a = a | (b & A[i]);
            b = b ^ A[i];
            c = ~(a & b);
            a = c & a;
            b = c & b;
        }
        return b;
    }
}