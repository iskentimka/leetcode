public class Problem125 {
    public static void main(String[] args) {
        String s = "rac aak car";
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println(s);
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int t = s.length();
        for (int i = 0; i < t; i++, t--) {
            if(s.charAt(i) != s.charAt(t - 1)){
                return false;
            }
        }
        return true;
    }
}
