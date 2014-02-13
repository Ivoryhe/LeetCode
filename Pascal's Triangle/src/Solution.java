import java.util.ArrayList;

/**
 * Feb-12-2014
 * @author Ivoryhe
 * Pascal's Triangle
 * 
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5,
 * 
 * Return
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(numRows == 0) {return result;}
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(i==0){
                list.add(1);
                result.add(list);
            }
            else{
                ArrayList<Integer> temp = result.get(i-1);
                for(int j=0; j<=temp.size(); j++){
                    if(j==0 || j==temp.size()){
                        list.add(1);
                    }
                    else{
                        list.add(temp.get(j-1)+temp.get(j));
                    }
                }
                result.add(list);
            }
        }
        return result;
    }
}