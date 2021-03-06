/**
 * Feb-11-2014
 * @author Ivoryhe
 * Roman to Integer
 * 
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        if(s.length() == 0) return result;

        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            int temp = singleRomanToInt(ch[i]);
            result = result + temp;
            if(i>0){
                int left = singleRomanToInt(ch[i-1]);
                if(ch[i] == ch[i-1]){
                    continue;
                }
                if(left < temp){
                    result = result - 2*left;
                }
            }
            if(i<ch.length-1){
                int right = singleRomanToInt(ch[i+1]);
                if(right < temp){
                    result = result + right;
                    i++;
                }
            }
        }
        return result;
    }
    
    public int singleRomanToInt(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}