import java.util.ArrayList;
import java.util.List;

public class Problem118 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < i+1 ;j++) {
                if(j == 0 || j == i){
                    t.add(1);
                }else{
                    int tmp = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    t.add(tmp);
                }
            }
            ans.add(t);
        }
        return ans;
    }
}
