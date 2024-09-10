class UniquePaths{
    int c=0;
    public int uniquePaths(int m, int n) {
        
        int i=0,j=0;
        String val="";

        return rec(i,j,m,n,val);
    }

    public int rec(int i,int j,int f1,int f2,String val){
        if(i==f1 || j==f2){
            return 0;
        }
        if(i==f1-1 && j==f2-1){
            c++;
            return 0;
        }
        rec(i+1,j,f1,f2,val+"H");
        rec(i,j+1,f1,f2,val+"V");

        return c;
    }


}