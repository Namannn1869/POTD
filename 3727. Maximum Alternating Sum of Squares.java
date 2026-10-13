class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            long v = nums[i];
            arr[i] = v*v;
        }

        int mid = (nums.length+1)/2;
        long sum = 0;
        int n = nums.length;

        Arrays.sort(arr);
        for(int i = n-1;i>=n-mid;i--){
            sum += arr[i];
        }

        for(int i=n-mid-1;i>=0;i--){
            sum -= arr[i];
        }

        return sum;
    }
}
