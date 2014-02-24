/**
 * Feb-23-2014
 * @author Ivoryhe
 * Count and Say
 * 
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 */
public class Solution {
    public String countAndSay(int n) {
        String result = "";
        if(n == 0){return result;}
        if(n == 1){return "1";}
        String s = countAndSay(n-1);
        char[] ch = s.toCharArray();
        int count = 1;
        String temp = "" + ch[0];
        for(int i=1; i<ch.length; i++){
            if(ch[i-1] == ch[i]){
                count++;
            }
            else{
                result = result + count + temp;
                count = 1;
                temp = ""+ch[i];
            }
        }
        
        result = result + count + temp;
        return result;
    }
}