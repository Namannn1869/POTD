class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE; ;
        if(k==1){
            return 0;
        }
        for(int i=0;i<=nums.length-k;i++){
            int diff=nums[i+k-1]-nums[i];
            res= Math.min(res,diff);
        }
        return res;
    }
}
