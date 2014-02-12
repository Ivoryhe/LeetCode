/**
 * Feb-11-2014
 * @author Ivoryhe
 * Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {return l2;}
        if(l2 == null) {return l1;}
        
        ListNode a = l1;
        ListNode b = l2;
        ListNode head;
        
        if(a.val < b.val){
            head = a; 
            a=a.next;
        }
        else{
            head = b; 
            b=b.next;
        }
        
        ListNode p = head;
        while(a != null && b!= null){
            if(a.val < b.val){
                p.next = a;
                p = p.next;
                a = a.next;
            }
            else{
                p.next = b;
                p = p.next;
                b = b.next;
            }
        }
        
        if(a != null){
            p.next = a;
        }
        
        if(b != null){
            p.next = b;
        }
        
        return head;
    }
}