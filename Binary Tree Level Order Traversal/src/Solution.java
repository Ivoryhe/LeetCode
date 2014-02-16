import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Feb-15-2014
 * @author Ivoryhe
 * Binary Tree Level Order Traversal 
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * return its level order traversal as:
 * [
 *  [3],
 *  [9,20],
 *  [15,7]
 * ]
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, 
 * where '#' signifies a path terminator where no node exists below.
 * Here's an example:
 *   1
 *  / \
 * 2   3
 *    /
 *   4
 *    \
 *     5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) {return result;}
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> q1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(root);
        
        while(q1.size() != 0){
            TreeNode node = q1.removeFirst();
            list.add(node.val);
            
            if(node.left != null){
                q2.add(node.left);
            }
            
            if(node.right != null){
                q2.add(node.right);
            }
            
            if(q1.size() == 0){
                ArrayList<Integer> l = new ArrayList<Integer>(list);
                result.add(l);
                list.clear();
                q1 = q2;
                q2 = new LinkedList<TreeNode>();
            }
        }
        return result;
    }
}