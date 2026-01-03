class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int req=nums.length/2;
        for(int i : map.keySet() ){
            if(map.get(i)==req){
                res=i;
            }
        }
        return res;
    }
}
