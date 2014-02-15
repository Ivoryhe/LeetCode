/**
 * Feb-14-2014
 * @author Ivoryhe
 * Swap Nodes in Pairs
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. 
 * You may not modify the values in the list, only nodes itself can be changed.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {return head;}
        
        ListNode p = head;
        ListNode q = head.next;
        ListNode previous = head;
        
        while(p != null && q != null){
            ListNode temp = p;
            p.next = q.next;
            q.next = p;
            if(temp == head){
                head = q;
            }
            else{
                previous.next = q;
            }
            
            previous = p;
            p = p.next;
            if(p == null){
                break;
            }
            else{
                q = p.next;
            }
        }
        return head;
    }
}