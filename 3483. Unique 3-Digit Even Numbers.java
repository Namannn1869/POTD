class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int i : digits){
            freq[i]++;
        }

        int ans = 0 ;
        for(int i=100;i<999;i++){
            int num = i;
            if(num%2!=0){
                continue;
            }
            int a = num%10;
            int b = (num/10)%10;
            int c = num/100;

            freq[a]--;
            freq[b]--;
            freq[c]--;

            if(freq[a]>=0 && freq[b]>=0 && freq[c]>=0){
                ans++;
            }

            freq[a]++;
            freq[b]++;
            freq[c]++;
        }

        return ans;
    }
}
