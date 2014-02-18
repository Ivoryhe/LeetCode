/**
 * Feb-16-2014
 * @author Ivoryhe
 * N-Queens II 
 * 
 * Follow up for N-Queens problem.
 * Now, instead outputting board configurations, 
 * return the total number of distinct solutions.
 */
public class Solution {
    public int totalNQueens(int n) {
        if(n<=0) {return 0;}
        int[] array = new int[n];
        int result = helper(0, n, array, 0);
        return result;
    }
    
    public int helper(int count, int n, int[] array, int result){
        if(n == count){
            result = result+1;
            count = 0;
            return result;
        }
        
        for(int i=0; i<n; i++){
            array[count] = i;
            boolean check = true;
            for(int j=0; j<count; j++){
                if(array[j] == array[count] || array[j]-j == array[count]-count || array[j]+j == array[count]+count){
                    check = false;
                    break;
                }
            }
            if(check){
                result = helper(count+1,n,array,result);
            }
        }
        return result;
    }
}