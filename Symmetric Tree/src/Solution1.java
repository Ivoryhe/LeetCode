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
public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {return true;}
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isSymmetric(left, right);
    }
    
    public boolean isSymmetric(TreeNode node1, TreeNode node2){
        if(node1 == null) {return node2 == null;}
        if(node2 == null) {return node1 == null;}
        boolean check = (node1.val == node2.val);
        return (check&&isSymmetric(node1.left, node2.right)&&isSymmetric(node1.right, node2.left));
    }
}