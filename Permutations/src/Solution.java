import java.util.ArrayList;

/**
 * Feb-14-2014
 * @author Ivoryhe
 * Permutations
 * 
 * Given a collection of numbers, return all possible permutations.
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] visited = new boolean[num.length];
        helper(num, result, list, visited);
        return result;
    }
    
    public void helper(int[] num, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, boolean[] visited){
        if(list.size() == num.length){
            ArrayList<Integer> l = new ArrayList<Integer>(list);
            result.add(l);
            return;
        }
        
        for(int i=0; i<num.length; i++){
            if(visited[i] == false){
                visited[i] = true;
                list.add(num[i]);
                helper(num, result, list, visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
}