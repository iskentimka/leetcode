public class Problem724 {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 0, 0, -1, -1};
        System.out.println(pivotIndex(nums));
    }

    private static int pivotIndex(int[] nums) {
        int res = -1;
        int right = nums[nums.length-1];
        int left = nums[0];
        for (int i = 1 , j = nums.length - 2; i == nums.length -1 || j == 0;) {
            if(left > right){
                right+=nums[j];
                j++;
            }else if (left<right){
                left+=nums[i];
                i++;
            }
            if(right == left && i + 1 == j - 1){
                res = i + 1;
            }
        }
        return res;
    }
}
