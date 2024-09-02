class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(long it: chalk) {
            sum += it;
        }

        long k1 = k%sum;

        for(int i = 0 ; i < chalk.length ; i++) {
            if(k1-chalk[i] < 0) return i;
            else {
                k1 -= chalk[i];
            }
        }

        return -1;
    }
}
