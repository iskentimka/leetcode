class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode tmp = head;
        int cnt = 1;
        while(tmp.next != null){
            tmp = tmp.next;
            cnt++;
        }
        cnt = cnt/2;
        while (cnt != 0){
            head = head.next;
            cnt--;
        }
        return head;
    }
}
