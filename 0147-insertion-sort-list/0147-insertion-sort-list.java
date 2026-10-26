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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        int n = 0;
        while(curr!=null){
            n++;
            curr= curr.next;
        }
        curr = head;
        for(int i=0;i<n;i++){
            while(curr!=null && curr.next!=null){
                if(curr.val>curr.next.val){
                    int temp = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = temp;
                }
                  curr = curr.next;
            }
          curr = head;
        }
        return head;
    }
}