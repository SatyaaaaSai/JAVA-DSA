package LinkedList.Problems;

public class LinkedListCycle {
    public static void main(String[] args) {

    }


    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
 //LC::141::linked list cycle One..
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; //fast will increments two moves .
            slow = slow.next; //slow incrememts one time..
            if (fast == slow) {
                return true;
            }

        }

        return false;
    }

    //find the length of the cycle

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; //fast will increments two moves .
            slow = slow.next; //slow incrememts one time..
            if (fast == slow) {
                //iterate the loop until slow meets fast..
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow) //temp!=fast..
                    return length;
            }

        }
        return 0;
    }
//linked list two

    //https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {

        int length = 0;

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; //fast will increments two moves .
            slow = slow.next; //slow incrememts one time..
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        //finding the start of the node..
        ListNode f = head;
        ListNode s = head;
 //we have to custom the second(s) pointer.how to custom it to s is equal to the f pointer????
        //So we iterate the length of the cycle to custom the s.
        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
