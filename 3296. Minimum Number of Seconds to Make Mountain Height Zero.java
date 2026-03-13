class Solution {
    public long minNumberOfSeconds(int height, int[] times) {

        long lo = 1;
        long hi = 10000000000000000L;

        while (lo < hi) {

            long mid = (lo + hi) >> 1;
            long totalLayers = 0;

            for (int t : times) {

                if (totalLayers >= height)
                    break;

                long layers = (long)(Math.sqrt((2.0 * mid) / t + 0.25) - 0.5);

                totalLayers += layers;
            }

            if (totalLayers >= height)
                hi = mid;
            else
                lo = mid + 1;
        }

        return lo;
    }
}
