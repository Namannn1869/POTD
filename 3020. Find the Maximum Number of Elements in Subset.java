class Solution {
    public int maximumLength(int[] nums) {
        int max = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int  i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int ones = 0;
        if(map.containsKey(1)){
            ones = map.get(1);
            if(ones % 2 ==0){
                ones--;
            }
        }
        max = Math.max(ones,max);

        for(int x : map.keySet()){
            if(x==1){
                continue;
            }

            long curr = x;
            int curr_len = 0;

            while(map.getOrDefault((int) curr,0) >=2 && curr < 1000000000L){
                curr_len += 2;
                curr *= curr;
            }

            if(map.getOrDefault((int) curr,0) > 0 && curr < 1000000000L){
                curr_len += 1;
            }
            else{
                curr_len -= 1;
            }
            max = Math.max(max,curr_len);
        }
        return max;
    }
}
