class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        
        while(max!=0){
            int temp = max;
            max = min % max;
            min = temp;
        }
    
    return min;
    }
}
