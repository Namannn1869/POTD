class Solution {
    public int maximizeSquareArea(int m, int n, int[] h_fences, int[] v_fences) {
        int MOD = (int)1e9 + 7;

        int h = h_fences.length, v = v_fences.length;
        int[] h_lines = new int[h + 2];
        h_lines[0] = 1; h_lines[1] = m;
        System.arraycopy(h_fences, 0, h_lines, 2, h);
        Arrays.sort(h_lines);

        int[] v_lines = new int[v + 2];
        v_lines[0] = 1; v_lines[1] = n;
        System.arraycopy(v_fences, 0, v_lines, 2, v);
        Arrays.sort(v_lines);

        int hs = h_lines.length, vs = v_lines.length;
        Set<Integer> h_set = new HashSet<>();
        for (int i = 0; i < hs; i++) {
            for (int j = i + 1; j < hs; j++) {
                h_set.add(h_lines[j] - h_lines[i]);
            }
        }

        long max_side = 0;
        for (int i = 0; i < vs; i++) {
            for (int j = i + 1; j < vs; j++) {
                int dist = v_lines[j] - v_lines[i];
                if (h_set.contains(dist)) {
                    max_side = Math.max(max_side, dist);
                }
            }
        }

        if (max_side == 0) return -1;

        long area = (max_side * max_side) % MOD;
        return (int)area;
    }
}
