class Solution {
    static class Pair {
        long count;
        long waviness;

        Pair(long count, long waviness) {
            this.count = count;
            this.waviness = waviness;
        }
    }

    private char[] digits;
    private Pair[][][][] memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long n) {
        if (n <= 0) return 0;

        digits = Long.toString(n).toCharArray();

        // pos, lenState(0/1/2), prev2(0..10), prev1(0..10)
        memo = new Pair[digits.length][3][11][11];

        return dfs(0, 0, 10, 10, true).waviness;
    }

    private Pair dfs(int pos, int lenState, int prev2, int prev1, boolean tight) {
        if (pos == digits.length) {
            return new Pair(1, 0);
        }

        if (!tight && memo[pos][lenState][prev2][prev1] != null) {
            return memo[pos][lenState][prev2][prev1];
        }

        int limit = tight ? digits[pos] - '0' : 9;

        long totalCount = 0;
        long totalWaviness = 0;

        for (int d = 0; d <= limit; d++) {
            boolean nextTight = tight && (d == limit);

            if (lenState == 0) {
                if (d == 0) {
                    Pair nxt = dfs(pos + 1, 0, 10, 10, nextTight);
                    totalCount += nxt.count;
                    totalWaviness += nxt.waviness;
                } else {
                    Pair nxt = dfs(pos + 1, 1, 10, d, nextTight);
                    totalCount += nxt.count;
                    totalWaviness += nxt.waviness;
                }
            } else if (lenState == 1) {
                Pair nxt = dfs(pos + 1, 2, prev1, d, nextTight);
                totalCount += nxt.count;
                totalWaviness += nxt.waviness;
            } else {
                int add = isPeakOrValley(prev2, prev1, d) ? 1 : 0;

                Pair nxt = dfs(pos + 1, 2, prev1, d, nextTight);

                totalCount += nxt.count;
                totalWaviness += nxt.waviness + nxt.count * add;
            }
        }

        Pair ans = new Pair(totalCount, totalWaviness);

        if (!tight) {
            memo[pos][lenState][prev2][prev1] = ans;
        }

        return ans;
    }

    private boolean isPeakOrValley(int left, int mid, int right) {
        return (mid > left && mid > right) ||
               (mid < left && mid < right);
    }
}
