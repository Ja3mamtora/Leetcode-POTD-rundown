class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            pre[i] = pre[i-1]^arr[i];
        }
        int ind = 0;
        for(int[] it: queries) {
            int i = it[0], j = it[1];
            if(i == 0) {
                ans[ind++] = pre[j];
            }
            else {
                ans[ind++] = pre[j]^pre[i-1];
            }
        }
        return ans;
    }
}
