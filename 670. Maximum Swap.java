class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int maxIndex = arr.length-1;
        int maxNum = arr[arr.length-1];
        int ind1 = -1;
        int ind2 = -1;

        for(int i = arr.length-2 ; i>= 0 ; i--) {
            if(arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
            else if(arr[i] < maxNum) {
                ind1 = i;
                ind2 = maxIndex;
            }
        }

        if(ind1 != -1 && ind2 != -1) {
            char temp = arr[ind1];
            arr[ind1] = arr[ind2];
            arr[ind2] = temp;
        }

        return Integer.parseInt(new String(arr));
    }
}
