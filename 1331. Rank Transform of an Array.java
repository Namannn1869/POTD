class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        Arrays.sort(arr);

        int rank = 1;
        for (int i=0; i<arr.length;i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], rank);
                rank++;
            }
        }
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = map.get(ans[i]);
        }
        return nums;
    }
}
