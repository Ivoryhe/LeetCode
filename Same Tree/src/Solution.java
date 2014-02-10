/**
 * Feb-10-2014
 * @author Ivoryhe
 * Same Tree 
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and 
 * the nodes have the same value.
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null){
            return q==p;
        }
        if (q == null){
            return p==q;
        }
        
        boolean result = false;
        if(p.val == q.val){
            result = true;
            boolean isSameLeft = isSameTree(p.left, q.left);
            boolean isSameRight = isSameTree(p.right, q.right);
            return result&&isSameLeft&&isSameRight;
        }
        else{
            return result;
        }
    }
}