public class problem27 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("Answer : "  + removeElement(nums, val));
    }
    public static int removeElement(int [] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
                System.out.println(nums[i]);
            }
        }
        return k;
    }
}
