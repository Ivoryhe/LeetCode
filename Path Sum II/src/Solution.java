import java.util.ArrayList;
/**
 * Feb-18-2014
 * @author Ivoryhe
 * Path Sum II 
 * 
 * Given a binary tree and a sum, 
 * find all root-to-leaf paths where each path's sum equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null ) {return result;}
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(root, sum, list, result);
        return result;
    }
    
    public void helper(TreeNode root, int sum, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result){
        
        if(root == null){
            return;
        }

        list.add(root.val);
        
        if((sum-root.val) == 0 && root.left == null && root.right == null){
            ArrayList<Integer> l = new ArrayList<Integer>(list);
            result.add(l);
            return;
        }
        
        if(root.left != null){
            helper(root.left,sum-root.val,list,result);
            list.remove(list.size()-1);
        }
        if(root.right != null){
            helper(root.right,sum-root.val,list,result);
            list.remove(list.size()-1);
        }
        
    }
}