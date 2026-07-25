class Solution {
    public int maxProduct(int n) {
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(n>0){
            int i = n%10;
            if(i > max){
                max2=max;
                max = i;
            }
            else if(i > max2){
                max2 = i;
            }
            n/=10;
        }


        return max * max2;
    }
}
