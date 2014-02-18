public class Solution {
    public int minDepth(TreeNode root) {
        int depth=0;
        if(root == null) {return depth;}
        depth++;
        if(root.left == null && root.right == null){
            return depth;
        }
        
        if(root.left == null){
            return depth+minDepth(root.right);
        }
        
        if(root.right == null){
            return depth+minDepth(root.left);
        }
        
        return depth+Math.min(minDepth(root.left), minDepth(root.right));
    }
}