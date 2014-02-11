/**
 * Feb-11-2014
 * @author Ivoryhe
 * Remove Element
 * 
 * Given an array and a value, remove all instances of 
 * that value in place and return the new length.
 * The order of elements can be changed. 
 * It doesn't matter what you leave beyond the new length.
 */
public class Solution {
    public int removeElement(int[] A, int elem) {
        int count = 0;
        int i = 0; 
        int j = A.length-1;
        while(i<=A.length-1-count && j>=0){
            if(A[i] == elem){
                A[i] = A[j];
                j--;
                i--;
                count++;
            }
            i++;
        }
        return A.length-count;
    }
}
