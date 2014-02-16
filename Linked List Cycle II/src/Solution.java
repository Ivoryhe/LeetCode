/**
 * Feb-15-2014
 * @author Ivoryhe
 * Linked List Cycle II 
 * 
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {return null;}
        ListNode p = head;
        ListNode q = p.next.next;
        ListNode meet = null;
        
        while(p != null && q != null){
            if(p == q){
                meet = p;
                break;
            }
            p = p.next;
            if(q.next == null){
                break;
            }
            else{
                q = q.next.next;
            }
        }
        
        if(meet == null) {return null;}
        
        ListNode point = head;
        
        while(point != meet){
            ListNode circle = meet.next;
            while(circle != meet){
                if(point == circle){
                    return point;
                }
                circle = circle.next;
            }
            point = point.next;
        }
        
        return meet;
    }
}