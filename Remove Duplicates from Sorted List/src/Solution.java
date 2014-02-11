/**
 * Feb-11-2014
 * @author Ivoryhe
 * Remove Duplicates from Sorted List
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {return head;}
        ListNode p = head;
        while(p != null){
            ListNode q = p.next;
            while(q != null && q.val == p.val){
                p.next = q.next;
                q = q.next;
            }
            p = p.next;
        }
        return head;
    }
}