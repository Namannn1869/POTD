class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> set = new HashSet<>();
            // set.add(nums.get(i));
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                int c = set.size();
                sum += c * c;
            }

        }
        return sum;
    }
}
