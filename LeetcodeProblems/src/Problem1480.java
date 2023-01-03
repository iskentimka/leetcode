public class Problem1480 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        for (int i = 0; i < runningSum(nums).length; i++) {
            System.out.println(runningSum(nums)[i]);
        }
    }

    private static int[] runningSum(int[] nums) {
        int [] helper = new int[nums.length];
        System.arraycopy(nums, 0, helper, 0, helper.length);
        for (int i = 1; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--)
                sum+=nums[j];
            helper[i] = sum;
        }
        return helper;
    }
}
