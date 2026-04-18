class Solution {
    public int mirrorDistance(int n) {
        int a = n;
        int N = 0;
        while(a!=0){
            N = N*10 + a%10;
            a/=10;
        }
        return Math.abs(n-N);
    }
}
