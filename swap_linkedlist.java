package day2;
public class swap_linkedlist {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode startNode = first;

        ListNode second = head;

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        int temp = startNode.val;
        startNode.val = second.val;
        second.val = temp;

        return head;
    }

    public static void display(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        display(head);

        head = swapNodes(head, 2);

        display(head);
    }
}
    
