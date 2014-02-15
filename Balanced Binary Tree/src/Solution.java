/**
 * Feb-14-2014
 * @author Ivoryhe
 * Balanced Binary Tree 
 * 
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, 
 * a height-balanced binary tree is defined as a binary tree 
 * in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {return true;}
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left == null && right == null){
            return true;
        }
        if(left == null){
            if(right.left == null && right.right == null){
                return true;
            }
            else{
                return false;
            }
        }
        if(right == null){
            if(left.left == null && left.right == null){
                return true;
            }
            else{
                return false;
            }
        }
        
        boolean heightCheck = false;
        if(Math.abs(height(root.left)-height(root.right))<=1){
            heightCheck = true;
        }
        return (isBalanced(left)&&isBalanced(right)&&heightCheck);
        
    }
    
    public int height(TreeNode root){
        int height = 0;
        if(root == null){
            return height;
        }
        height++;
        return height+Math.max(height(root.left),height(root.right));
    }
}
