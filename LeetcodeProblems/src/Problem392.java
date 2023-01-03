import java.util.Stack;

public class Problem392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "aaxacc"));
    }
    public static boolean isSubsequence(String s, String t){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.add(c);
        }
        for (int i = t.length() - 1; i >= 0; i--) {
            if(stack.empty()) return true;
            if(t.charAt(i) == stack.peek()){
                stack.pop();
            }
        }
        return stack.empty();
    }
}
