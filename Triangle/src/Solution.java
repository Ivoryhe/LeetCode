import java.util.ArrayList;
/**
 * Feb-23-2014
 * @author Ivoryhe
 * Triangle 
 * 
 * Given a triangle, find the minimum path sum from top to bottom. 
 * Each step you may move to adjacent numbers on the row below.
 * 
 * For example, given the following triangle
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, 
 * where n is the total number of rows in the triangle.
 */
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<triangle.size(); i++){
            ArrayList<Integer> list = triangle.get(i);
            if(result.size()==0){
                result.add(list.get(0));
                continue;
            }
            for(int j=list.size()-1; j>=0; j--){
                if(j == list.size()-1){
                    result.add(result.get(j-1)+list.get(j));
                }
                else if (j == 0){
                    result.set(j,result.get(j)+list.get(j));
                }
                else {
                    result.set(j,list.get(j)+Math.min(result.get(j),result.get(j-1)));
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<result.size(); i++){
            if(min > result.get(i)){
                min = result.get(i);
            }
        }
        return min;
    }
}