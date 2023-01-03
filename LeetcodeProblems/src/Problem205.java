import java.util.ArrayList;
import java.util.HashMap;

public class Problem205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
    }

    private static boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }else
                    hm.put(s.charAt(i), t.charAt(i));
            }else
                if(hm.get(s.charAt(i)) != t.charAt(i) ){
                    return false;
                }
        }
        return true;
    }
}
