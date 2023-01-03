public class Problem724 {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 0, 0, -1, -1};

        System.out.println(pivotIndex(nums));
    }

    private static int pivotIndex(int[] nums) {
        int res = -1;
        int aft = 0;
        int bef = 0;
        for (int n : nums) {
            aft += n;
        }

        for (int i = 0; i < nums.length; i++) {
            aft-= nums[i];
            if (aft == bef) {
                return i;
            }
            bef += nums[i];

        }
        return res;
    }
}
