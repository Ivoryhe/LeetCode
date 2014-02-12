import java.util.Stack;

/**
 * Feb-11-2014
 * @author Ivoryhe
 * Symmetric Tree
 * 
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).
 * 
 * For example, this binary tree is symmetric:
 * 
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 
 * But the following is not:
 *    1
 *   / \
 *  2   2
 *   \   \
 *    3   3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, 
 * where '#' signifies a path terminator where no node exists below.
 * Here's an example:
 *    1
 *   / \
 *  2   3
 * 	   /
 *    4
 *     \
 *      5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 * 
 */
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {return true;}
        TreeNode left = root.left;
        TreeNode right = root.right;
        Stack<TreeNode> sLeft = new Stack<TreeNode>();
        Stack<TreeNode> sRight = new Stack<TreeNode>();
        
        TreeNode p = left;
        TreeNode q = right;
        
        while((!sLeft.empty() && !sRight.empty())||(p != null && q != null)){
            while(p != null && q != null){
            if(p.val != q.val) {return false;}
                sLeft.push(p);
                sRight.push(q);
                p = p.left;
                q = q.right;
            }
            if((p == null && q != null) || (p != null && q == null)) {return false;}
            
            if(!sLeft.empty() && !sRight.empty()){
                TreeNode a = sLeft.pop();
                TreeNode b = sRight.pop();
                p = a.right;
                q = b.left;
            }
            
            if((p == null && q != null) || (p != null && q == null)) {return false;}
        }
        
        if((p == null && q != null) || (p != null && q == null)) {return false;}
        return true;
    }
}