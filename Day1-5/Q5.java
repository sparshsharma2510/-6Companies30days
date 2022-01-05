import java.util.*;

public class Q5{
	public static void main(String[] args) {
		
	}
	long getNthUglyNo(int n) {
        // code here
        long[] dp = new long[n+1];
        dp[0] = 1;
        
        int p2 = 0, p3 = 0, p5 = 0;
        for(int i = 1; i < n+1; i++){
            long f2 = dp[p2]*2;
            long f3 = dp[p3]*3;
            long f5 = dp[p5]*5;
            
            dp[i] = Math.min(f2, Math.min(f3,f5));
            
            if(dp[i] == f2)
                p2++;
            if(dp[i] == f3)
                p3++;
            if(dp[i] == f5)
                p5++;
        }
        return dp[n-1];
    }
}