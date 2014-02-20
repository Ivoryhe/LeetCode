/**
 * Feb-19-2014
 * @author Ivoryhe
 * Convert Sorted List to Binary Search Tree
 * 
 * Given a singly linked list where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode point = head;
        int count = 0;
        while(point != null){
            count++;
            point = point.next;
        }

        TreeNode result = helper(head, 1, count);
        return result;
    }
    
    public TreeNode helper(ListNode head, int start, int end){
        TreeNode root = null;
        if(start > end || start < 0 || end < 0 || head == null){
            return root;
        }
        
        ListNode point = head;
        int mid = (start+end+1)/2;
        int i = 1;
        while(i<mid){
            point = point.next;
            i++;
        }
        
        root = new TreeNode(point.val);

        if(start == end){return root;}
        
        root.left = helper(head,start,mid-1);
        if(point != null && point != head){
            root.right = helper(point.next,1,end-mid);
        }
        return root;
    }
}