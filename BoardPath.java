import java.util.ArrayList;
import java.util.List;
public class BoardPath{
    static int count=0;
    static List<String> lis = new ArrayList<>();
    public static void rec(int start,int sum,String s){
        
        if(start>sum){
            
            return;
        }
        if(start==sum){
            count++;
            lis.add(s);
        }
        for(int d=1;d<=6;d++){
            rec(start+d, sum, s+d);
        }          
        s="";
    }
    public static void main(String[] args){
        int n=10;
    rec(0,n,"");
    for(String x: lis){
        System.out.println(x);
    }
    System.out.println("COUNT" + count);
    }
}