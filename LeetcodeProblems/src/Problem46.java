import java.util.ArrayList;

import java.util.List;

public class Problem46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        perm(nums, nums.length);
    }

//    public static List<List<Integer>> permute(int[] nums) {
//        return perm(nums, nums.length);
//    }
    public static void printNum(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }

    public static void perm(int[] nums, int size) {

        if (size == 1){
            printNum(nums);
        }
        for (int i = 0; i < size; i++) {
            perm(nums,size - 1);
            if(size % 2 == 1){
                int tmp = nums[size-1];
                nums[size-1] = nums[0];
                nums[0] = tmp;
            }else{
                int tmp = nums[size-1];
                nums[size-1] = nums[i];
                nums[i] = tmp;
            }

        }
}
}
