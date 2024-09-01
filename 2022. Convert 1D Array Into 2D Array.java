class Solution {
    public int[][] construct2DArray(int[] org, int m, int n) {
        int k = 0;
        int[][] arr = new int[m][n];

        if((m*n) > org.length || (m*n) < org.length) return new int[][]{};

        for(int i = 0 ; i < m && k < org.length ; i++) {
            for(int j = 0 ; j < n && k < org.length; j++) {
                arr[i][j] = org[k++];
            }
        }

        return arr;
    }
}
