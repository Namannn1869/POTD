class Solution {
    public static int len(int n){
        int c = 0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c;
    }

    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        ArrayList<Integer> ans = new ArrayList<>();
        int l1 = len(low);
        int l2 = len(high);
        for(int i = l1;i<=l2;i++){
            for(int j = 0;j<10-i;j++){
                int num = Integer.parseInt(s.substring(j, i + j));
                if( num >= low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
        
    }
}
