/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
         Node current=head;//1
        while(current!=null)
        {
            if(current.child!=null)//3
            {
                Node child=current.child;//7
                Node last=child;
                while(last.next!=null)
                {
                    last=last.next;//last=10;
                }
                last.next=current.next;
                if(current.next!=null)
                {
                    current.next.prev=last;
                }
                current.next=child;
                child.prev=current;
                current.child=null;
            }
            current=current.next;
        }
        return head;
    }

    }
