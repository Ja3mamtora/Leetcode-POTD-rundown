class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<String,Integer>mp = new HashMap<>();
        for(int it: arr1) {
            String curr = Integer.toString(it);
            for(int i = 1 ; i <= curr.length() ; i++) {
                String part = curr.substring(0,i);
                mp.put(part,mp.getOrDefault(part,0)+1);
            }
        }
        int maxLen = 0;

        for(int it:  arr2) {
            String curr = Integer.toString(it);
            for(int i = 1 ; i <= curr.length() ; i++) {
                if(mp.containsKey(curr.substring(0,i))) {
                    maxLen = Math.max(maxLen,i);
                }
            }
        }
        return maxLen;
    }
}
