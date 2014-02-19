import java.util.Arrays;

/**
 * Feb-18-2014
 * @author Ivoryhe
 * 3Sum Closest 
 * 
 * Given an array S of n integers, 
 * find three integers in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(num);
        
        for(int i=0; i<num.length-2; i++){
            int delta = target-num[i];
            int twoSum = helper(num, i+1, delta);
            if(result == Integer.MAX_VALUE){
                result = twoSum+num[i];
            }
            if(twoSum+num[i]-target == 0) {return target;}
            if(Math.abs(twoSum+num[i]-target) < Math.abs(result-target)){
                result = twoSum+num[i];
            }
        }
        return result;
    }
    
    
    public int helper(int[] num, int i, int delta){
        int j=num.length-1;
        int min = Integer.MAX_VALUE;
        int record = min;
        while(i<j){
            int temp = Math.abs(delta - (num[i] + num[j]));
            int tmp = delta-(num[i] + num[j]);
            if(temp < min){
                min = temp;
                record = num[i] + num[j];
            }
            if(tmp > 0){
                i++;
            }
            else if(tmp < 0){
                j--;
            }
            else{
                return delta;
            }
        }
        return record;
    }
}