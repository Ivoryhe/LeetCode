/**
 * Feb-23-2014
 * @author Ivoryhe
 * Flatten Binary Tree to Linked List
 * 
 * Given a binary tree, flatten it to a linked list in-place.
 * For example:
 * Given
 * 
 *          1
 *         / \
 *        2   5
 *       / \   \
 *      3   4   6
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
 * click to show hints.
 * 
 * Hints:
 * If you notice carefully in the flattened tree, 
 * each node's right child points to the next node of a pre-order traversal.
 */
public class Solution2 {
	public void flatten(TreeNode root) {
        if(root == null) {return;}
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left != null){
            while(left.right != null){
                left = left.right;
            }
            left.right = right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
}
