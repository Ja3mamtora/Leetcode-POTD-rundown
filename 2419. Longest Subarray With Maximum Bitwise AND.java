class Solution {
    public int longestSubarray(int[] nums) {
        int maxi = -1;
        for(int i = 0 ; i < nums.length ; i++) maxi = Math.max(nums[i],maxi);

        int len = 1;
        for(int i = 0 ; i < nums.length ;) {
            if(nums[i] != maxi) i++;
            else {
                int j = i;
                while(j < nums.length && nums[j] == maxi) j++;
                len = Math.max(j-i,len);
                i = j;
            }
        }
        return len;
    }
}
