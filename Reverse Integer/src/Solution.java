/**
 * Feb-10-2014
 * @author Ivoryhe
 * Reverse Integer
 * 
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * click to show spoilers.
 * Have you thought about this?
 * Here are some good questions to ask before coding. 
 * Bonus points for you if you have already thought through this!
 * If the integer's last digit is 0, what should the output be? 
 * ie, cases such as 10, 100.
 * Did you notice that the reversed integer might overflow? 
 * Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 * Throw an exception? Good, but what if throwing an exception is not an option? 
 * You would then have to re-design the function (ie, add an extra parameter).
 */
public class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        String result = "";
        char[] ch = s.toCharArray();
        for(int i=1; i<ch.length; i++){
            result = "" + ch[i] +result;
        }
        if(ch[0] == '-'){
            result = "" + ch[0] + result;
        }
        else{
            result = result + ch[0];
        }
        return Integer.parseInt(result);
    }
}