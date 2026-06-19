class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int total = 0;
        for(int i=0;i<gain.length;i++){
            total += gain[i];
            max = Math.max(total,max);
        }
        return max; 
    }
}
