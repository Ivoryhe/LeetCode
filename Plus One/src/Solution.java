import java.util.ArrayList;
/**
 * Feb-16-2014
 * @author Ivoryhe
 * Plus One 
 * 
 * Given a number represented as an array of digits, plus one to the number.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int base = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=len-1; i>=0; i--){
            int temp = digits[i]+base;
            if(temp < 10){
                list.add(temp);
                base = 0;
            }
            else{
                list.add(0);
                base = 1;
            }
        }
        
        if(base == 1){
            list.add(1);
        }
        
        int[] result = new int[list.size()];
        int i=0;
        while(!list.isEmpty()){
            result[i] = list.remove(list.size()-1);
            i++;
        }
        return result;
    }
}