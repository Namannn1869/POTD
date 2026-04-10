import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if (n < 3) return -1;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDist = Integer.MAX_VALUE;

        for (ArrayList<Integer> list : map.values()) {
            if (list.size() >= 3) {
                for (int i = 0; i <= list.size() - 3; i++) {
                    int first = list.get(i);
                    int third = list.get(i + 2);

                    int dist = 2 * (third - first);
                    minDist = Math.min(minDist, dist);
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
