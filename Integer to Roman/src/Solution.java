/**
 * Feb-12-2014
 * @author Ivoryhe
 * Integer to Roman
 * 
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    public String intToRoman(int num) {
        int[] numbers = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] s = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
        String result = "";
        int i=12;
        while(num > 0){
            if(num >= numbers[i]){
                result = result + s[i];
                num = num-numbers[i];
            }
            else{
                i--;
            }
        }
        return result;
    }
}