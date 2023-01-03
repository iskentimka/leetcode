import java.util.Stack;

class Problem20 {
    public static void main(String[] args) {
        System.out.println(isValid("{}[]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> checker = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                checker.push(')');
            else if (c == '{')
                checker.push('}');
            else if (c == '[')
                checker.push(']');
            else if (checker.empty() || checker.pop() != c )
                return false;
        }
        return checker.empty();
    }
}