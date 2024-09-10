public class RodCuttingDP {

  public static void main(String[] args) {
    int[] cost = {0, 1, 5, 8, 9, 10, 17, 17, 20};
    int[] dp = new int[cost.length + 1];
    int res = rodCutting(cost, 8, dp);
    System.out.println("MAX price we can get:" + res);
  }
  private static int rodCutting(int[] cost, int totPieces, int[] dp) {
    if (totPieces == 0) {
      return dp[0];
    }
    if(dp[totPieces]!=0){
        return dp[totPieces];
    }
    for (int i = 1; i <= totPieces; i++) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < i; j++) {
          int tot = cost[j] + dp[i - j - 1];
          if (tot > max) {
            max = tot;
          }
        }
        dp[i] = max;
      }
    return dp[totPieces];
  }
}
