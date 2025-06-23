package Questions.Add_two_numbers;

import java.util.List;

public class AddTwoNumbers {
    ListNode addTwoList(ListNode n1, ListNode n2, ListNode head) {
        ListNode current = head;
        return current.next;
    }

    void Display(ListNode l1) {
        ListNode current = l1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // 465
        ListNode head = l1;
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoList(l1, l2, head); // Should return 7 -> 0 -> 8 (807)
        adder.Display(l1);
        // Print result
        /*
         * while (result != null) {
         * System.out.print(result.val + (result.next != null ? " -> " : ""));
         * result = result.next;
         * }
         */
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
