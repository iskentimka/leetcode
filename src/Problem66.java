public class Problem66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] == 9){
                if(i == 0){
                    digits = new int[digits.length+1];
                    digits[i] = 1;
                }
                else
                    digits[i] = 0;
            }else
            {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }
    public static void main(String[] args) {

    }
}
