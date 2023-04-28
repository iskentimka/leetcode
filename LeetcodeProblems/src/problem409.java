import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class problem409 {
    public static void main(String[] args){
        String n = "a";
        System.out.println(longestPalindrome(n));
    }
    public static int longestPalindrome(String s) {
        int alp [] = new int[128];
        for(char c : s.toCharArray()){
            alp[c]++;
        }
        int res = -1;
        for (int i : alp) {
            if(i % 2 != 0){
                res++;
            }
        }
        return res > 0 ? s.length() - res : s.length();
    }
}
