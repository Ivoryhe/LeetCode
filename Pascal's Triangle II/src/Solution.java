import java.util.ArrayList;
/**
 * Feb-16-2014
 * @author Ivoryhe
 * Pascal's Triangle II 
 * 
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 */

public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(rowIndex < 0) {return result;}
        for(int i=0; i<=rowIndex; i++){
            result.add(1);
        }
        
        int i=rowIndex;
        while(i>0){
            for(int j=1; j<i; j++){
                result.set(j,result.get(j-1) + result.get(j));
            }
            i--;
        }
        return result;
    }
}