/**
 * Feb-10-2014
 * @author Ivoryhe
 * Linked List Cycle
 * 
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 */
public class Solution{
	public boolean hasCycle(ListNode head) {
	        ListNode p = head;
	        ListNode q = head;
	        if (head == null) return false;
	        while(p != null && q.next != null){
	            p = p.next;
	            q = q.next.next;
	            if(p == null|| q == null) return false;
	            if(p == q) return true;
	        }
	        return false;    
	}
}