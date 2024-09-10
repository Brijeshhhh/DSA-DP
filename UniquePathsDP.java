class UniquePathsDP{
    int c=0;
    String val="";
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        int i=0,j=0;
        
        return rec(i,j,m,n,val,dp);
    }
    
    public int rec(int i,int j,int f1,int f2,String val,int[][]dp){
        if(i==f1 || j==f2){
            return dp[i][j];
        }
        if(i==f1-1 && j==f2-1){
            if (dp[i][j] == 0) {
                dp[i][j]++;
            }
            return dp[i][j];
        }
        if(dp[i][j]!=0){
          return dp[i][j]; 
        }
        else{
            dp[i][j]+=rec(i+1,j,f1,f2,val+"H",dp);
            dp[i][j]+=rec(i,j+1,f1,f2,val+"V",dp);
        }
        return dp[i][j];
    }


}