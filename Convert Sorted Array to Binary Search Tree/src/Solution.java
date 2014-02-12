/**
 * Feb-11-2014
 * @author Ivoryhe
 * Convert Sorted Array to Binary Search Tree
 * 
 * Given an array where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0) {return null;}
        TreeNode result = helper(0, num.length-1, num);
        return result;
    }
    
    public TreeNode helper(int start, int end, int[] num){
        if(start > end){
            return null;
        }
        if(start == end) {
            TreeNode n = new TreeNode(num[start]);
            return n;
        }
        int mid = (start + end)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(start, mid-1, num);
        node.right = helper(mid+1, end, num);
        return node;
    }
}