/**
 * Feb-23-2014
 * @author Ivoryhe
 * Partition List
 * 
 * Given a linked list and a value x, 
 * partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * 
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */
public class Solution {
    public static ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) {return head;}
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode small = dummy;
        ListNode large = dummy;
        ListNode point = head;
        boolean firstLarge = false;
        ListNode largeStart = null;
        while(point !=  null){
        	//System.out.println(point.val);
            if(point.val < x){
            	//System.out.println(point.val);
                small.next = point;
                //System.out.println(point.next.val);
                small = small.next;
                if(!firstLarge){
                    large = small;
                    //point = point.next;
                }
                else{
                    large.next = point.next;
                    
                    small.next = largeStart;
                }
                //point = point.next;
            }
            else{
                large.next = point;
                large = large.next;
                if(!firstLarge){
                    largeStart = large;
                    firstLarge = true;
                }
                //point = point.next;
            }
           point = point.next;
            //System.out.println(point.val);
        }
        return dummy.next;
    }
    
    public static void main(String[] args){
    	ListNode a = new ListNode(1);
    	ListNode b = new ListNode(2);
    	b.next = a;
    	partition(b,2);
    }
}