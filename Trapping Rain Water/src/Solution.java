import java.util.Stack;
/**
 * Feb-16-2014
 * @author Ivoryhe
 * Trapping Rain Water 
 * 
 * Given n non-negative integers representing an elevation map 
 * where the width of each bar is 1, compute how much water it is able to trap after raining.
 * For example, 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class Solution {
    public int trap(int[] A) {
        int sum = 0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<A.length; i++){
            if(i == 0){
                s.push(i);
            }
            else{
                if(A[i] < A[i-1]){
                    s.push(i);
                }
                else{
                    int low = s.pop();
                    int start = -1;
                    while(!s.empty() && A[low] < A[i]){
                        start = s.peek();
                        sum = sum + (i-start-1)*(Math.min(A[i], A[start]) - A[low]);
                        low = s.peek();
                        if(A[low] < A[i]){s.pop();}
                    }
                    s.push(i);
                }
            }
        }
        return sum;
    }
}