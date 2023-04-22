public class problem28 {
    public static void main(String[] args) {
        System.out.println(strStr("sasbutsadd", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            System.out.println(haystack.substring(i, i + needle.length()));
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;
    }
}
