class Solution {
    int maxi = 1;
    int solve(HashSet<String>st, int ind, String s, int maxi, String curr) {
        if(ind == s.length()) {
            maxi = Math.max(maxi,st.size());
            return maxi;
        }

        curr += s.charAt(ind);
        // System.out.println(curr + " " + maxi);
        if(st.contains(curr)) {
            maxi = Math.max(maxi,solve(st,ind+1,s,maxi,curr));
        }
        else {
            st.add(curr);
            maxi = Math.max(maxi,solve(st,ind+1,s,maxi,""));
            st.remove(curr);
            maxi = Math.max(maxi,solve(st,ind+1,s,maxi,curr));
        }
        return maxi;
    } 
    public int maxUniqueSplit(String s) {
        HashSet<String>st = new HashSet<>();
        return solve(st,0,s,maxi,"");
    }
}
