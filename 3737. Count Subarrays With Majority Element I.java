class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int target_count = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    target_count++;
                }
                int len = j - i + 1;
                if (target_count * 2 > len) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
