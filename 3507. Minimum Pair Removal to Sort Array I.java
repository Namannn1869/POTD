class Solution {
    public int minimumPairRemoval(int[] nums) {
        int c =0 ;
        while(true){
        boolean sorted = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                sorted =false;
            }
        }

        if(sorted){
            return c;
        }

        int min = Integer.MAX_VALUE;
        int a =0 ;
        for(int i=0;i<nums.length-1;i++){
            int sum = nums[i]+nums[i+1];
            if(sum<min){
                min = sum ;
                a = i; // wo index jis per min sum aya 
            } 
        }

        int[] new1 = new int[nums.length-1];
        int j=0;

        for(int i=0;i<nums.length;i++){
            if(i==a){ //jisper min sum tha un indexes ka sum merge krke daalna  
                new1[j++]=nums[i]+nums[i+1];
                i++; 
            }
            else{
                new1[j++] = nums[i];
            }
        }

        nums =  new1;
        c++;

        }
    }
}
