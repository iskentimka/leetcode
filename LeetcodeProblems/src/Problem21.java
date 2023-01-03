import java.util.ArrayList;
import java.util.List;

public class Problem21 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1 == null)
           return list2;
       if (list2 == null)
           return list1;
       if (list1.val > list2.val){
           list2.next = mergeTwoLists(list1,list2.next);
           return list2;
       }
       else {

           list1.next = mergeTwoLists(list2,list1.next);
           return list1;
       }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

