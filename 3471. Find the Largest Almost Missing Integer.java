class Solution {
    public int largestInteger(int[] nums, int k) {
        int c = -1;
        ;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                c = Math.max(c, i);
            }
        }
        return c;
    }

}
