class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high < nums.length){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            while(map.get(nums[high]) > k){
                map.put(nums[low],map.get(nums[low])-1);
                low++;
                if(map.get(nums[low]) == 0){
                    map.remove(nums[low]);
                }
            }

            int len = high -low +1;
            res= Math.max(res,len);
            high++;
        }
        return res;
    }
}
