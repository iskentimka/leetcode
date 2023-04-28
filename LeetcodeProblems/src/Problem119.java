import java.util.ArrayList;
import java.util.List;

public class Problem119 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < rowIndex+1; i++){
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
        return ans.get(rowIndex);
    }
}
