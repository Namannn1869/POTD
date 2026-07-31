class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Sort frequencies
        Arrays.sort(freq);

        int ans = 0;
        int count = 0;

        // Process frequencies from highest to lowest
        for (int i = 25; i >= 0; i--) {

            // No more characters left
            if (freq[i] == 0)
                break;

            // Assign push count
            ans += freq[i] * ((count / 8) + 1);

            count++;
        }

        return ans;
    }
}
