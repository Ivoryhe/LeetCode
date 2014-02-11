import java.util.ArrayList;
import java.util.Stack;
/**
 * Feb-10-2014
 * @author Ivoryhe
 * 
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,2,3].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) {
            return list;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode p = root;
        while(!s.empty() || p != null){
            while(p != null){
                s.push(p);
                list.add(p.val);
                p = p.left;
            }
            
            if(!s.empty()){
                TreeNode node = s.pop();
                if(node.right != null){
                    p = node.right;
                }
            }
        }
        return list;
    }
}