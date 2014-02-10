/**
 * Feb-10-2014
 * @author Ivoryhe
 * Maximum Depth of Binary Tree
 * 
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along 
 * the longest path from the root node down to the farthest leaf node.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int result=0;
        result = 1+Math.max(maxDepth(left), maxDepth(right));
        return result;
    }
}