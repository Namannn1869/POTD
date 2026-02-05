class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int index = (i+nums[i])%n;
                res[i]=nums[index];
            }
            else if(nums[i]==0){
                res[i]=nums[i];
            }
            else{
                int shift=Math.abs(nums[i]);
                int index =((i-shift)%n + n)%n;
                res[i]=nums[index];
            }
        }
        return res;
    }
}
