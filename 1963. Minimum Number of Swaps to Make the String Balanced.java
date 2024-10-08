class Solution {
    public int minSwaps(String s) {
        int i = 0;
        Stack<Character>st = new Stack<>();
        while(i < s.length()) {
            Character ch = s.charAt(i);
           if(st.isEmpty()) {
                st.push(ch);
                i++;
                continue;
           }

           if(st.peek() == '[' && ch == ']') {
                st.pop();
           }
           else {
                st.push(ch);
           }
           i++;
        }
        return ((st.size()/2)+1)/2;
    }
}
