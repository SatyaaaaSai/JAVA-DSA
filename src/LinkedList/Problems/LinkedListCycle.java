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

        //find the length of the cycle

    public int hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next; //fast will increments two moves .
            slow=slow.next; //slow incrememts one time..
            if(fast==slow){
               //iterate the loop until slow meets fast..
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow) //temp!=fast..
            }

        }

        return 0;

}
