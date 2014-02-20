import java.util.ArrayList;
import java.util.Arrays;
/**
 * Feb-19-2014
 * @author Ivoryhe
 * Subsets 
 * 
 * Given a set of distinct integers, S, return all possible subsets.
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 * 
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(S);
        helper(result, list, S, 0);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] S, int start){
        ArrayList<Integer> l = new ArrayList<Integer>(list);
        result.add(l);
        
        for(int i=start; i<S.length; i++){
            list.add(S[i]);
            helper(result,list,S,i+1);
            list.remove(list.size()-1);
        }
    }
}