package LinkedList.Problems;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public boolean hasCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next; //fast will increments two moves .
                slow=slow.next; //slow incrememts one time..
                if(fast==slow){
                    return true;
                }

            }

            return false;
        }
}
