class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] modFreq = new int[k];

        for (int num : arr) {
            int correctedRem = (num % k + k) % k;
            modFreq[correctedRem]++;
        }

        if (modFreq[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (modFreq[i] != modFreq[k - i]) {
                return false;
            }
        }

        return true;
    }
}
