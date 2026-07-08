class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
      int MOD = 12345;
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++)
             {
                arr[index++] = grid[i][j];
             }
        }
        long[] prefix = new long[size];
        long[] suffix = new long[size];
        prefix[0] = 1;
        for (int i = 1; i < size; i++) 
        {
            prefix[i] = (prefix[i - 1] * arr[i - 1]) % MOD;
        }
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--)
         {
            suffix[i] = (suffix[i + 1] * arr[i + 1]) % MOD;
         }
        int[][] ans = new int[m][n];
        index = 0;
        for (int i = 0; i < m; i++)
         {
            for (int j = 0; j < n; j++)
             {
                ans[i][j] = (int) ((prefix[index] * suffix[index]) % MOD);
                index++;
             }
         }
        return ans;
    }
}   