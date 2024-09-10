import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BoardPathDP{
    static int count=0;
    static List<String> lis = new ArrayList<>();
    public static int rec(int start ,int sum,String s,int[] dp){
        
        if(start>sum){
            return 0;
        }
        if(start==sum){
            count++;
            dp[start] = count;
            lis.add(s);
            return dp[start];
        }
            
        
        if(dp[start]!=0){
            return dp[start];
        }
        for(int d=1;d<=6;d++){
           dp[start]+= rec(start+d, sum, s+d,dp);
        }
        s="";
        return dp[start];
    }

    public static void main(String[] args){
        int n=10;
        int[] dp = new int[n+1];
        rec(0,n,"",dp);
        for(String x: lis){
            System.out.println(x);
        }
        System.out.println("count:" + Arrays.toString(dp));
    }
}