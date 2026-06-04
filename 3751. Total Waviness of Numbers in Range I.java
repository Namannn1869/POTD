class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            char[] s = String.valueOf(i).toCharArray();
            if(s.length < 3){
                continue;
            }
            for(int a=1;a<s.length-1;a++){
                if(s[a-1]>s[a] && s[a+1]>s[a]){
                    ans++;
                }
                else if(s[a-1]<s[a] && s[a+1]<s[a]){
                    ans++;
                }
            }
        }
        return ans;
    }
}
