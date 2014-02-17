import java.util.ArrayList;
/**
 * Feb-16-2014
 * @author Ivoryhe
 * Combinations
 * 
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * For example,
 * If n = 4 and k = 2, a solution is:
 * 
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(k>n || n<=0) {return result;}
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(result,list,1,n,k);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int start, int n, int k){
        if(list.size() == k){
            ArrayList<Integer> l = new ArrayList<Integer>(list);
            result.add(l);
            return;
        }
        
        for(int i=start; i<=n; i++){
            list.add(i);
            helper(result,list,i+1,n,k);
            list.remove(list.size()-1);
        }
    }
}