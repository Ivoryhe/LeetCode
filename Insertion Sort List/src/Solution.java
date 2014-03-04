/**
 * Mar-4-2014
 * @author Ivoryhe
 * Insertion Sort List 
 * 
 * Sort a linked list using insertion sort.
 */
public class Solution {
	public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        
        ListNode previousP = dummy;
        ListNode p = dummy.next;
        ListNode previousQ = dummy.next;
        ListNode q = dummy.next.next;
        while(q != null){
            while(p.val <= q.val && p != q){
                previousP = p;
                p = p.next;
            }
            if(p.val > q.val){
                ListNode temp = q.next;
                previousP.next = q;
                q.next = p;
                previousQ.next = temp;
                q = temp;
            }
            else{
                previousQ = q;
                q = q.next;
            }
            p = dummy.next;
            previousP = dummy;
        }
        
        return dummy.next;
    }
}
