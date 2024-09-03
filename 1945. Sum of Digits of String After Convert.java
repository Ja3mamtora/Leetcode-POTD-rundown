class Solution {
    public int getLucky(String s, int k) {
        String t = "";
        for(int i = 0 ; i < s.length() ; i++) {
            int d = s.charAt(i) - 'a'+1;
            t += d;
        }
        int ans = 0;
        while(k > 0) {
            int sum = 0;
            for(int i = 0 ; i < t.length() ; i++) {
                sum += t.charAt(i)-'0';
            }
            ans = sum;
            t = ""+sum;
            k--;
        }
        return ans;
    }
}
