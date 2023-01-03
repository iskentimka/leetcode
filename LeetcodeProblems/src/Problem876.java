public class Problem876 {
    public static void main(String[] args) {
        ListNode t = new ListNode();
        t.val = 3;
        t.next.val = 4;
        t.next.next.val=5;
        t.next.next.next.next = null;
        printList(t);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode middleNote(ListNode head){
        if (head == null) return null;
        ListNode tmp = head;
        int cnt = 0;
        while(tmp.next != null){
            cnt++;
            tmp = tmp.next;
        }
        cnt = cnt/2;
        while (cnt >= 0){
            head = head.next;
            cnt--;
        }
        return head;
    }


    public static void printList(ListNode head)
    {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
