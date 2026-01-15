class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int h = check(hBars);
        int v = check(vBars);
        int side = Math.min(h, v);
        return side * side;
    }

    private int check(int[] a) {
        Arrays.sort(a);
        int best = 1;
        int cur = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1){
                cur++;
            }
            else{
                cur = 1;
            }
            best = Math.max(best, cur);
        }
        return best + 1;
    }
}
