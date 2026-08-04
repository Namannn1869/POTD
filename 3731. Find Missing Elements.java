class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        int min = nums[0];
        int max = nums[nums.length - 1];

        int index = 0;

        for (int i = min; i <= max; i++) {
            if (index < nums.length && nums[index] == i) {
                index++;
            } else {
                list.add(i);
            }
        }

        return list;
    }
}
