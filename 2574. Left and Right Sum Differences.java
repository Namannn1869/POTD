class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[i]=0;
            }
            else{
                leftsum+=nums[i-1];
                left[i]=leftsum;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                right[i]=0;
            }
            else{
                rightsum+=nums[i+1];
                right[i]=rightsum;
            }
        }

        int[] answer =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i]= Math.abs(left[i]-right[i]);
        }
        return answer;
    }
}
