import java.util.ArrayList;
import java.util.List;

public class problem26 {
    public static void main(String[] args) {
        int [] n = {1,1,2};
        System.out.println("Answer " + removeDuplicates(n));
    }
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]){
                nums[k] = nums[i+1];
                k++;
            }
        }
        return k;
    }


}

