/**
 * Feb-15-2014
 * @author Ivoryhe
 * Remove Duplicates from Sorted Array II 
 * 
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length <= 2) {return A.length;}
        int duplicate=0;
        int pervious = duplicate;
        int i=0;
        while(i<A.length-duplicate){
            int offset = i+2;
            int start = offset;
            while(offset<A.length-pervious && A[i] == A[offset]){
                duplicate++;
                offset++;
            }
            if(pervious != duplicate){
                for(int j=offset; j<A.length-pervious; j++){
                    A[start] = A[j];
                    start++;
                }
                i = i+2;
                pervious = duplicate;
            }
            else{
                i = i+1;
            }
        }
        return A.length-duplicate;
    }
}