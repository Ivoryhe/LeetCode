import java.util.ArrayList;
import java.util.Stack;

/**
 * Feb-10-2014
 * @author Ivoryhe
 * Binary Tree Inorder Traversal
 * 
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *    \
 *      2
 *    /
 *   3
 * return [1,3,2].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * OJ's Binary Tree Serialization:
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
public class Solution1 {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root ==  null) return list;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode p = root;
        while(p != null){
            s.push(p);
            p = p.left;
        }
        
        while(!s.empty()){
            TreeNode  node = s.pop();
            list.add(node.val);
            TreeNode right = node.right;
            if(right != null){
                TreeNode rightLeft = right.left;
                if(rightLeft != null){
                    s.push(right);
                    TreeNode q = rightLeft;
                    while(q != null){
                        s.push(q);
                        q = q.left;
                    }
                }
                else{
                    s.push(right);
                }

            }
        }
        
        return list;
    }
}