class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        long sum =0;

        while(n>0){
            int digit = n%10;
            if(digit!=0){
                list.add(digit);
                sum += digit;
            }
            n/=10;
        }
        long ans = 1;
        long num =0;
        for(int i = list.size()-1;i >=0;i--){
            num = num*10 + list.get(i);
        }
        return num*sum;
    }
}
