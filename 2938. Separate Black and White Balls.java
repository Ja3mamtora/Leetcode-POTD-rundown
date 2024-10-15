class Solution {
    public long minimumSteps(String s) {
        long cnt = 0, ans = 0;
        int i = s.length()-1;

        while(i >= 0) {
            if(s.charAt(i) == '0') cnt++;
            else {
                ans += cnt;
            }
            i--;
        }
        return ans;
    }
}
