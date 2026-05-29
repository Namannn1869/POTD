class Solution {
    public int minElement(int[] nums) {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int num = 0;
            while(ele>0){
                int digit=ele%10;
                num += digit;
                ele/=10;
            }
            nums[i]=num;
            min=Math.min(min,num);
        }
        return min;
    }
}
