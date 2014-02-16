import java.util.ArrayList;
/**
 * Feb-15-2014
 * @author Ivoryhe
 * Generate Parentheses 
 * 
 * Given n pairs of parentheses, 
 * write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 */
public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        if(n <= 0) return result;
        String s = "";
        helper(n, 0, 0,result, s);
        return result;
    }
    
    public void helper(int n, int left, int right, ArrayList<String> result, String s){
        if(left > n || right > n) return;
        if(right > left) return;
        if(s.length() == 2*n){
            result.add(s);
            return;
        }
        helper(n,left+1,right,result,s+"(");
        helper(n,left,right+1,result,s+")");
        
    }
}