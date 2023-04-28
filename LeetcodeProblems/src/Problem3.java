public class Problem3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0,cnt = 0;
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if(tmp.toString().contains(c)) {
                tmp = new StringBuilder(tmp.substring(tmp.indexOf(c) + 1 ) );
                tmp.append(s.charAt(i));
                cnt = tmp.length();
            }else{
                tmp.append(s.charAt(i));
                cnt++;
            }
            if (max < cnt) {
                max = cnt;
            }
            System.out.println(tmp);
            System.out.println(cnt);
        }
        return max;
    }
}
