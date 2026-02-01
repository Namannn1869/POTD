class Solution{
    public int minimumCost(int[] nums){
        int n = nums.length;
        int cost=0;
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i]<first){
                second=first;
                first=nums[i];
            }
            else if(nums[i]<second){
                second=nums[i];
            }
        }

        cost=nums[0]+first+second;
        return cost;
    }
}


// class Solution {
//     public int minimumCost(int[] nums) {
//         int n =nums.length;
//         int cost=nums[0];
//         for(int i=1;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]>nums[j]){
//                     int temp=nums[i];
//                     nums[i]=nums[j];
//                     nums[j]=temp;
//                 }
//             }
//         }
//         cost+= nums[1]+nums[2];
//         return cost;
//     }
// }
