class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>st = new HashSet<>();
        int cnt = 0;

        for(int i = 0 ; i < allowed.length() ; i++) st.add(allowed.charAt(i));

        for(String it: words) {
            boolean flg = false;
            for(int i = 0 ; i < it.length() ; i++) {
                if(!st.contains(it.charAt(i))) {
                    flg = true;
                    break;
                }
            }
            if(!flg) cnt++;
        }
        return cnt;
    }
}
