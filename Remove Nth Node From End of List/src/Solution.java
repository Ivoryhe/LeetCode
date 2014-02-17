/**
 * Feb-16-2014
 * @author Ivoryhe
 * Remove Nth Node From End of List 
 * 
 * Given a linked list, remove the nth node from the end of list and return its head.
 * 
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        ListNode previous = null;
        while(p != null && n>0){
            p = p.next;
            n--;
        }
        
        if( p == null){
            head = head.next;
        }
        else{
            while(p != null){
                previous = q;
                q = q.next;
                p = p.next;
            }
            
            previous.next = q.next;
        }
        return head;
    }
}