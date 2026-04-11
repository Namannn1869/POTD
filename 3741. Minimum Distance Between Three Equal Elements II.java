class Solution {
    public int minimumDistance(int[] nums) {
        int n= nums.length;
        if(n<3){
            return -1;
        }
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        boolean found =false;
        int minDist = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i],new ArrayList<Integer>());
            ArrayList<Integer> list = map.get(nums[i]);
            list.add(i);
            
            if(list.size()>=3){
                int len = list.size();
                int x = list.get(len-3);
                int y = list.get(len-2);
                int z = list.get(len-1);
                found=true;
                minDist=Math.min(minDist,Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x));
            }
        }

        if(found){
            return minDist;
        }
        return -1;
    }
}
