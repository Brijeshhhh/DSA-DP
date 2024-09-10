import java.util.Arrays;

public class FiboDP{
    public static void main(String[] args){
        int s=6;
        int[] dp = new int[s+1];
        System.out.println(fibo(dp,s));

    }
    public static int fibo(int[] dp,int s){
        if(s==0 || s== 1){
            dp[s]=s;
            return s;
        }

        dp[s]= fibo(dp,s-1)+fibo(dp,s-2);
        System.out.println(Arrays.toString(dp));
        return dp[s];
    }
}