class AllOne {
    Map<String,Integer>mp;
    TreeSet<Pair<Integer,String>>st;

    public AllOne() {
        mp = new HashMap<>();
        st = new TreeSet<>(
            (a,b) -> a.getKey().equals(b.getKey()) ? a.getValue().compareTo(b.getValue()) : a.getKey()-b.getKey());
    }
    
    public void inc(String key) {
        int n = mp.getOrDefault(key,0);
        mp.put(key,n+1);

        st.remove(new Pair<>(n,key));
        st.add(new Pair<>(n+1,key));
    }
    
    public void dec(String key) {
        int n = mp.get(key);

        st.remove(new Pair<>(n,key));

        if(n == 1) {
            mp.remove(key);
        }
        else {
            mp.put(key,n-1);
            st.add(new Pair<>(n-1,key));
        }
    }
    
    public String getMaxKey() {
        return st.isEmpty() ? "" : st.last().getValue();
    }
    
    public String getMinKey() {
        return st.isEmpty() ? "" : st.first().getValue();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
