/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s, ans;
        ans = 1;
        s = 1;
        while(s <= n){
            int m = s + (n-s)/ 2;
            if(isBadVersion(m)){
                n = m - 1;
                ans = m;
            }else if (!isBadVersion(m)){
                s = m + 1;
            }
        }
        return ans;
    }
}
