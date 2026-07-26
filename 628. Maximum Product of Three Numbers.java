class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i : nums) {

            if (i > m1) {
                m3 = m2;
                m2 = m1;
                m1 = i;
            } else if (i > m2) {
                m3 = m2;
                m2 = i;
            } else if (i > m3) {
                m3 = i;
            }

            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }

        }
        return Math.max(m1 * m2 * m3, min1 * min2 * m1);
    }
}
