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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       
        if(left==right){
            return head;
        }

        if(left ==1){
            ListNode curr2 = head;
            ListNode prev = null;
            for(int i=left;i<=right;i++){
                ListNode nextNode = curr2.next;
                curr2.next = prev;
                prev = curr2;
                curr2 = nextNode;
            }
            head.next = curr2;
            return prev;
        }
        ListNode curr = head;
       for(int i=1;i<left-1;i++){
        curr = curr.next;
       }
       ListNode start = curr.next;
       ListNode curr2 = start;
       ListNode prev = null;
       for(int i=left;i<=right && curr2!=null;i++){
        ListNode nextNode = curr2.next;
        curr2.next = prev;
        prev = curr2;
        curr2 = nextNode;
       }
    
       curr.next = prev; 
       start.next = curr2;

       return head;
    }
}