class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            int digit= n.charAt(i)-'0';
            max=Math.max(max,digit);
            if(digit==9){
                return 9;
            }
        }
        return max;
    }
}
