import java.util.ArrayList;
import java.util.Arrays;
/**
 * Feb-19-2014
 * @author Ivoryhe
 * Subsets II 
 * 
 * Given a collection of integers that might contain duplicates, 
 * S, return all possible subsets.
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,2], a solution is:
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(result,list,num,0);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] num, int start){
        ArrayList<Integer> l = new ArrayList<Integer>(list);
        result.add(l);
        
        for(int i=start; i<num.length; i++){
            
            list.add(num[i]);
            helper(result,list,num,i+1);
            list.remove(list.size()-1);
            while(i<num.length-1 && num[i+1] == num[i]){
                i++;
            }
        }
    }
}