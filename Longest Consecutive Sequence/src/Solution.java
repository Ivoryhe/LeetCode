import java.util.HashSet;
import java.util.Set;
/**
 * Feb-23-2014
 * @author Ivoryhe
 * Longest Consecutive Sequence 
 * 
 * Given an unsorted array of integers, 
 * find the length of the longest consecutive elements sequence.
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 */
public class Solution {
    public int longestConsecutive(int[] num) {
        int len = num.length;
        if(len <= 1) {return len;}
        int max=1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i:num){
            set.add(i);
        }
        for(int i:num){
            int count = 1;
            int left = i-1;
            int right = i+1;
            while(set.contains(left)){
                set.remove(left);
                count++;
                left--;
            }
            while(set.contains(right)){
                set.remove(right);
                count++;
                right++;
            }
            set.remove(i);
            max = Math.max(count,max);
        }
        return max;
    }
    
}