public class Problem206 {
    public class ListNode {
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

    public static ListNode reverseList(ListNode head) {
        if(head.next == null){
            return head;
        }
        head.next.val = head.val;
        head = reverseList(head.next);
        return head;
    }


}
