import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.HashMap;
import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));

    }

    private static List <String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<String>();
        HashMap<Character , String> base= new HashMap<>();
        base.put('2', "abc");
        base.put('3', "def");
        base.put('4', "ghi");
        base.put('5', "jkl");
        base.put('6', "mno");
        base.put('7', "pqrs");
        base.put('8', "tuv");
        base.put('9', "wxyz");
        List<String> list = new ArrayList<>();
        String f = base.get(digits.charAt(0));
        if(digits.length()==1){
            for (int i = 0; i < f.length(); i++) {
                list.add(f.charAt(i) + "");
            }
            return list;
        }
        List<String> tmp = letterCombinations(digits.substring(1));
        for(int i = 0; i < f.length(); i++){
            for(int j = 0; j < tmp.size();j++){
                list.add(f.charAt(i) + tmp.get(j));
            }
        }
        return list;
    }
}