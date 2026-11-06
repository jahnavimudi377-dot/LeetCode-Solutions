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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode evenHead = null;
        ListNode oddHead = null;
        ListNode etemp = null;
        ListNode otemp = null;
        int n = 1; 
        while(curr!=null){
            if(n%2!=0){
            if(oddHead==null){
                oddHead = curr;
                otemp = curr;
            }
            else{
                otemp.next = curr;
                otemp = curr;  
                
            }
            }
            else{
            if(evenHead==null){
                evenHead = curr;
                etemp = curr;
            }
            else{
                etemp.next = curr;
                etemp = curr;
                
            }
            }
           n++;
           curr = curr.next;
        }
        otemp.next = evenHead;
        etemp.next = null;
        return oddHead;
    }
}