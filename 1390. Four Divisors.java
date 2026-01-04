class Solution {
    int sum=0;
    int count=0;
    public int sumFourDivisors(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            sum=check(nums[i]);
            if(sum!=0){
                total=total+sum;
            }
        }
        return total;
    }

    private int check(int n){
        sum=0;
        count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int a=i;
                int b=n/i;

                count++;
                sum+=a;
            
                if(a!=b){
                    count++;
                    sum+=b;
                }
            }
            if(count>4){
               return 0;
            }
        }
        return count==4?sum:0;
    }
}
