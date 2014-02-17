import java.util.ArrayList;
import java.util.Stack;
/**
 * Feb-16-2014
 * @author Ivoryhe
 * Binary Tree Postorder Traversal 
 * 
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *   1
 *    \
 *     2
 *    /
 *   3
 * return [3,2,1].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(root == null) {return list;}
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode point = root;
        
        s.add(root);
        while(!s.empty()){
            TreeNode node = s.pop();
            list.add(0,node.val);
            if(node.left != null){
                s.push(node.left);
            }
            if(node.right != null){
                s.push(node.right);
            }
        }
        
        return list;
    }
}