class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int b=0;

        for (char c : moves.toCharArray()) {
            if (c == 'L'){
                l++;
            }
            else if (c == 'R'){
                r++;
            }
            else{
                b++;
            }
        }

        int ans1= r+b-l;
        int ans2= l+b-r;
        return Math.max(ans1,ans2);
    }
}
