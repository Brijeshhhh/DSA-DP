public class RodCutting {
    public static void main(String[] args) {
        int[] cost = {0, 1, 5, 8, 9, 10, 17, 17, 20};
        int res = rodCutting(cost, 8);
        System.out.println("MAX price we can get:" + res);
    }

    private static int rodCutting(int[] cost, int totPieces) {
        if (totPieces == 0) {
            return 0;
        }

        int max = cost[totPieces];
        int left = 1;
        int right = totPieces - 1;

        while (left <= right) {
            int firstPiece = rodCutting(cost, left);
            int secondPiece = rodCutting(cost, right);
            int tot = firstPiece + secondPiece;
            if (tot > max) {
                max = tot;
            }
            left++;
            right--;
        }

        return max;
    }
}