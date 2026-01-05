class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int a = matrix[i][j];
                if(a<0){
                    count++;
                }
                sum += Math.abs(a);
                min= Math.min(min, Math.abs(a));
            }
        }
        if (count%2 != 0) {
            sum -= 2L * min;
        }

        return sum;
    }
}
