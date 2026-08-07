class Solution {
    static int[][] minDigits = new int[20][20];
    static int[][] E2 = { {0}, {0}, {1}, {0}, {2}, {0}, {1}, {0}, {3}, {2} };
    static int[][] E3 = { {0}, {0}, {0}, {1}, {0}, {0}, {1}, {0}, {0}, {2} };
    static int[] E5 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
    static int[] E7 = { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 };

    public String smallestNumber(String num, long t) {
        long temp = t;
        long a = 0, b = 0, c = 0, d = 0;
        while (temp % 2 == 0) { a++; temp /= 2; }
        while (temp % 3 == 0) { b++; temp /= 3; }
        while (temp % 5 == 0) { c++; temp /= 5; }
        while (temp % 7 == 0) { d++; temp /= 7; }
        if (temp > 1) return "-1";

        int n = num.length();
        long reqDigits = getMinDigits(a, b, c, d);
        
        if (reqDigits > n) {
            StringBuilder sb = new StringBuilder();
            fillSuffix(sb, a, b, c, d, reqDigits);
            return sb.toString();
        }

        // Additional prefix matching and backtracking logic goes here...
        return "-1";
    }

    private long getMinDigits(long a, long b, long c, long d) {
        long ans = c + d;
        long twos = Math.max(0, a - 3 * (b / 2));
        long threes = b % 2;
        if (twos > 0) {
            ans += (twos + 2) / 3;
        } else if (threes > 0) {
            ans += 1;
        }
        return ans;
    }

    void fillSuffix(StringBuilder sb, long a, long b, long c, long d, long k) {
        for (long pos = 0; pos < k; pos++) {
            for (int x = 1; x <= 9; x++) {
                long na = Math.max(0, a - E2[x][0]);
                long nb = Math.max(0, b - E3[x][0]);
                long nc = Math.max(0, c - E5[x]);
                long nd = Math.max(0, d - E7[x]);
                if (getMinDigits(na, nb, nc, nd) <= k - pos - 1) {
                    sb.append((char) ('0' + x));
                    a = na; b = nb; c = nc; d = nd;
                    break;
                }
            }
        }
    }
}
