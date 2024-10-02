class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();
        HashMap<Integer,Integer>mp = new HashMap<>();

        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            mp.put(sortedUniqueNumbers[i], i + 1);
        }

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = mp.get(arr[i]);
        }

        return arr;
    }
}
