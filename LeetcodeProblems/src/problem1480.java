public class problem1480 {
    public static void main(String[] args) {

    }
    public static int[] runningSum(int[] nums) {
        int [] sum  = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            sum[i] += sum[i-1];
        }
        return sum;
    }

}
