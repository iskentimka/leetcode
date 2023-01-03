class Problem345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        char [] ans = s.toCharArray();
        String b = "";
        int c = s.length() - 1;
        int [] vNum = new int [s.length()];
        for(int i = 0; i < s.length(); i++){
            String temp = String.valueOf(s.charAt(i));
            if(v.contains(temp)){
                b+=s.charAt(i);
                vNum[c] = i;
                c--;
            }
        }
        int j = 0;
        for(int i = s.length() - b.length(); i < s.length(); i++){
            ans[vNum[i]] = b.charAt(j);
            j++;
        }
        s = String.valueOf(ans);
        return s;
    }
}