class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int i = 0;
        int j = 1;
        int ans = 0;

        while(i < str.length() && j < str.length()) {
            if(str.charAt(j) == '0') {
                j++;
            } else {
                ans = Math.max(j - i, ans);
                i = j++;
            }
        }
        return ans;
    }
}
