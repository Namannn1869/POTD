class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int[][] land = new int[landStartTime.length][2];
        int[][] water = new int[waterStartTime.length][2];

        for (int i = 0; i < land.length; i++) {
            land[i][0] = landStartTime[i];
            land[i][1] = landDuration[i];
        }

        for (int i = 0; i < water.length; i++) {
            water[i][0] = waterStartTime[i];
            water[i][1] = waterDuration[i];
        }

        int t = Integer.MAX_VALUE;

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < water.length; j++) {
                int landFinish = land[i][0] + land[i][1];
                int ans1 = Math.max(landFinish, water[j][0]) + water[j][1];

                int waterFinish = water[j][0] + water[j][1];
                int ans2 = Math.max(waterFinish, land[i][0]) + land[i][1];

                t = Math.min(t, Math.min(ans1, ans2));
            }
        }

        return t;
    }
}
