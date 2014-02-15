import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Feb-14-2014
 * @author Ivoryhe
 * Binary Tree Level Order Traversal II
 * 
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7]
 *   [9,20],
 *   [3],
 * ]
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * OJ's Binary Tree Serialization:
 * 
 * The serialization of a binary tree follows a level order traversal, 
 * where '#' signifies a path terminator where no node exists below.
 * 
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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) {return result;}
        LinkedList<TreeNode> q1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> q2 = new LinkedList<TreeNode>();
        
        q1.add(root);
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        while(q1.size() != 0){
            TreeNode node = q1.removeFirst();
            l.add(node.val);
            if(node.left != null){
                q2.add(node.left);
            }
            if(node.right != null){
                q2.add(node.right);
            }
            
            if(q1.size() == 0){
                ArrayList<Integer> list = new ArrayList<Integer>(l);
                l.clear();
                result.add(0,list);
                q1 = q2;
                q2 = new LinkedList<TreeNode>();
            }
        }
        
        return result;
    }
}