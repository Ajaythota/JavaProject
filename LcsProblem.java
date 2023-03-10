import java.util.*;
import java.math.*;
import java.io.*;
//LCS = Longest Common subsequence
class Lcs_common {
    public int CommonChild(String s1, String s2) {
        //int cnt = 0;
        int [] [] dp= new int[s1.length()+1][ s2.length()+1];
        System.out.println(s1 + " " + s2);
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j <=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                         dp[i][j]=dp[i-1][j-1] +1 ;
                }
                else
                     dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                System.out.print(dp[i][j] +"-");
            }
            System.out.println("");
        }
        System.out.println(s1.length()+ "-" + s2.length());
        return dp[s1.length()][s2.length()];
    }
}
public class LcsProblem {

    public static void main(String []args){
        Lcs_common  lcs = new Lcs_common();
        int maxlength = lcs.CommonChild("SARRY","SALLY");
        System.out.println(maxlength);

    }


}
