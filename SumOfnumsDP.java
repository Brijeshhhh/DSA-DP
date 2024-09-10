import java.util.Arrays;

public class SumOfnumsDP {
    public static void main(String[] args) {
        int s = 6;
        int[] dp = new int[s + 1];
        System.out.println(sum(dp, s, 0));
    }

    public static int sum(int[] dp, int s, int su) {
        if (s == 0 || s==1) {
            dp[s] = s;
            return s;
        }

        if (dp[s] != 0) {
            return dp[s];
        }

        for (int i = 1; i <= s; i++) {
            if (s - i >= 0) {
                dp[s] += sum(dp, s - i, su + i);
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[s];
    }
}
