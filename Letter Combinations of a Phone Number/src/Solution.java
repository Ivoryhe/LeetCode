import java.util.ArrayList;
/**
 * Mar-4-2014
 * @author Ivoryhe
 * Letter Combinations of a Phone Number 
 * 
 * Given a digit string, return all possible letter combinations 
 * that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, 
 * your answer could be in any order you want.
 */

public class Solution {
	public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<String>();
        if(digits.length() <= 0){
            result.add(digits);
            return result;
        }
        
        String[] num = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        char[] ch = digits.toCharArray();
        int[] digit = new int[ch.length];
        for(int i=0; i<ch.length; i++){
            digit[i] = ch[i]-'0';
        }
        
        StringBuilder sb = new StringBuilder("");
        helper(num,digit,result,0,sb);
        return result;
    }
    
    public void helper(String[] num, int[] digit, ArrayList<String> result, int count, StringBuilder sb){
        int len = digit.length;
        if(len == count){
            String s = sb.toString();
            result.add(s);
            return;
        }
        
        int temp = digit[count];
        String tmp = num[temp];
        for(int j=0; j<tmp.length(); j++){
            sb.append(tmp.charAt(j));
            helper(num, digit, result, count+1, sb);
            sb.deleteCharAt(count);
        }
    }
}
