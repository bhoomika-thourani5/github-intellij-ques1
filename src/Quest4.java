public class Quest4 {

    public static String lcs(String X, String Y) {

        int m = X.length();
        int n = Y.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }

                else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int i = m;
        int j = n;

        String lcsStr = "";

        while (i > 0 && j > 0) {

            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcsStr = X.charAt(i - 1) + lcsStr;
                i--;
                j--;
            }

            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            }

            else {
                j--;
            }
        }

        System.out.println("LCS Length: " + dp[m][n]);

        return lcsStr;
    }

    public static void main(String[] args) {

        String name = "BHOMIKA".toUpperCase();
        String string2 = "ETAOINSHR";

        String result = lcs(name, string2);

        System.out.println("String1: " + name);
        System.out.println("String2: " + string2);
        System.out.println("LCS: " + result);
    }
}