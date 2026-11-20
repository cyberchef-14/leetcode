class Solution {

    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return lcs(text1, text2, n, m, dp);
    }

    public int lcs(String a, String b, int i, int j, int[][] dp) {

        // Base case
        if (i == 0 || j == 0) {
            return 0;
        }

        // DP check
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // If characters match
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
            dp[i][j] = 1 + lcs(a, b, i - 1, j - 1, dp);
        }

        // If characters don't match
        else {
            dp[i][j] = Math.max(
                lcs(a, b, i - 1, j, dp),
                lcs(a, b, i, j - 1, dp)
            );
        }

        return dp[i][j];
    }
}
