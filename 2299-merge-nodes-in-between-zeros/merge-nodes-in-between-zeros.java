/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode modify=head;
        ListNode current=head.next;
        int total=0;
        while(current!=null){
            
                total+=current.val;
            
            if(current.val==0){
                modify.next.val=total;
                modify=modify.next;
                total=0;
            }
            current=current.next;
        }
        modify.next=null;
        return head.next;
    }
}