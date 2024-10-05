class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>mp = new HashMap<>();
        int len = s1.length();

        for(int i = 0 ; i < len ; i++) {
            mp.put(s1.charAt(i), mp.getOrDefault(s1.charAt(i),0)+1);
        }

        int j = 0 , i = 0, cnt = mp.size();

        while(j < s2.length()) {
            if(mp.containsKey(s2.charAt(j))){
                mp.put(s2.charAt(j), mp.get(s2.charAt(j))-1);
                if(mp.get(s2.charAt(j)) == 0) {
                    cnt--;
                }
            }
            
            if(j-i+1 < len) j++;
            else if(j-i+1 == len) {
                if(cnt == 0) {
                    return true;
                }
                if(mp.containsKey(s2.charAt(i))) {
                    mp.put(s2.charAt(i),mp.getOrDefault(s2.charAt(i),0)+1); 
                    if(mp.get(s2.charAt(i)) == 1) {
                        cnt++;
                    }
                }
                i++;
                j++;
            }
        }
        return false;
    }
}
