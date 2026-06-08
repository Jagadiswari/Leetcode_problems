class ListNode1{
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
    }
}
public class MidOfLinkedList {
    public static ListNode1 middleNode(ListNode1 head) {
        ListNode1 slow = head;
        ListNode1 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);
        ListNode1 mid = middleNode(head);
        System.out.println("Middle Node = " + mid.val);
    }
}