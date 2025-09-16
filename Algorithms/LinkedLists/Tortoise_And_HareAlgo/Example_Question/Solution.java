package Algorithms.LinkedLists.Tortoise_And_HareAlgo.Example_Question;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // creation of cycle
        node4.next = node2;

        boolean result = Tortoise_And_HareAlgo.detectCycle(head);
        System.out.printf("Cycle Detected : %s", result);
    }
}

class Tortoise_And_HareAlgo {
    public static boolean detectCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;

            if (slowptr == fastptr) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}