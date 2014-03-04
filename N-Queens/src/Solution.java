import java.util.ArrayList;

/**
 * Mar-4-2014
 * @author Ivoryhe
 * N-Queens 
 * 
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard 
 * such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens' placement, 
 * where 'Q' and '.' both indicate a queen and an empty space respectively.
 * 
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 * 
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 */
public class Solution {
	public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> result = new ArrayList<String[]>();
        if(n<=0) return result;
        
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = -1;
        }
        
        helper(list, n, 0, result);
        return result;
    }
    
    public void helper(int[] list, int n, int count, ArrayList<String[]> result){
        if(count == n){
            String[] ss = new String[n];
            for(int i=0; i<n; i++){
                ss[i] = stringHelper(list[i],n);
            }
            result.add(ss);
            return;
        }
        
        for(int i=0; i<n; i++){
            list[count] = i;
            boolean check = true;
            for(int j=0; j<count; j++){
                if(list[count]+count == list[j]+j || list[count]-count == list[j]-j || list[count] == list[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                helper(list,n,count+1,result);
            }
        }
    }
    
    public String stringHelper(int k, int n){
        StringBuffer bf = new StringBuffer("");
        for(int i=0; i<n; i++){
            if(i != k){
                bf.append(".");
            }
            else{
                bf.append("Q");
            }
        }
        return bf.toString();
    }
}
