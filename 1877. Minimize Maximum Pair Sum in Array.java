class Solution {
    public int minPairSum(int[] numbers) {
        Arrays.sort(numbers);

        int start = 0;
        int end = numbers.length - 1;
        int maxPair = 0;
        while (start < end) {
            int pairSum = numbers[start] + numbers[end];
            if (pairSum > maxPair) {
                maxPair = pairSum;
            }
            start++;
            end--;
        }

        return maxPair;
    }
}
