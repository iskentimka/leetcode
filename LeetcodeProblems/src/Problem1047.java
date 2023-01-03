import java.util.Iterator;
import java.util.Stack;

public class Problem1047 {
    public static String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.empty() && stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder ans = new StringBuilder("");
        while(!stack.empty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}