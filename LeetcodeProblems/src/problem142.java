import java.util.Hashtable;

public class problem142 {
    public static void main(String[] args) {

    }

    public static Problem206.ListNode detectCycle(Problem206.ListNode head) {
        Hashtable<Integer,Integer> h = new Hashtable<>();
        Problem206.ListNode res = head;
        while(res != null){
            if(h.containsValue(res.val)){
                return res;
            }
            h.put(res.val,res.next.val);
        }return null;
    }
}
