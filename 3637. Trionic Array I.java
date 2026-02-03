class Solution {
    public boolean isTrionic(int[] nums) {
        int up = 0;
        int down = 0;
        boolean change = false;
        boolean finalUp = false;

        if (nums.length < 4) {
            return false;
        }

        if (nums[0] >= nums[1]) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (!change && nums[i] < nums[i + 1]) {
                up = 1;
            }

            else if (!change && nums[i] > nums[i + 1]) {
                down = 1;
                change = true;
            }

            else if (change && !finalUp && nums[i] > nums[i + 1]) {
                continue;
            }

            else if (change && nums[i] < nums[i + 1]) {
                finalUp = true;
                up = 2;
            }

            else {
                return false;
            }
        }

        return up == 2 && down == 1 && finalUp;
    }
}
